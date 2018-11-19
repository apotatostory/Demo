const gulp = require('gulp');
const browserify = require('browserify');
const watchify = require('watchify');
const uglify = require('gulp-uglify');
const source = require('vinyl-source-stream');
const reactify = require('reactify');
const buffer = require('vinyl-buffer');
const babelify = require('babelify');
const fs = require('fs');

/** 讀取指定錄下全部js檔案*/
var listJSFile = function(path) {
  fs.readdir(path, (e, files) => {
    if(e) throw e;
    files.forEach(file => {
      let rootPath = path + "/" + file;
      fs.stat(rootPath, (e, stats) => {
        if(e) throw e;
        if(stats.isDirectory()) {
          // 為資料夾,跑遞迴
          listJSFile(rootPath);
        } else if(stats.isFile()) {
          // 為檔案,執行gne
          genHomejs(path, file);
        }
      });
    });
  })
};

/** 打包JS*/
const genHomejs = function(path, file) {
  console.info("--- 開始監看 " + file + "---");
    var browser = browserify({
        entries: [path + "/" + file], //原始檔案
        transform: [babelify, reactify], //babel(ES6->ES5), reactify(ES5->react)
        debug: true, // sourcemap
        cache: {}, // required for watchify
        packageCache: {}, // required for watchify
        fullPaths: true
    });
    var watch = watchify(browser);

    function render(watch) {
        return watch
            .bundle()
            .on('error', function(err) {
                console.error("錯誤 ：" + err.message);
            })
            .pipe(source(file))
            //uglify 要搭配buffer()
            .pipe(buffer())
            .pipe(uglify({
                mangle: true, //类型：Boolean 默认：true 是否修改变量名
                compress: true //类型：Boolean 默认：true 是否完全压缩
            }))
            .pipe(gulp.dest(path.replace("./src", "../resources/static")));
    }

    return render(watch
        .on('update', function() {
            var start = Date.now();
            render(watch);
            var end = new Date();
            console.log(end.getHours() + ":" + end.getMinutes() + ":" + end.getSeconds() + ' 更新 ' + file + '， 耗時', (end.getTime() - start) + 'ms');
        }));
};

gulp.task('PackageJS', listJSFile.bind(this, "./src/js"));

// 引用 gulp plugin
var gulp = require('gulp');

// 建立預設 gulp task
gulp.task('default', function () {
    console.log('hi~hi~hi~~~');
});

// 定義名稱為 other 的 gulp 工作
gulp.task('other', function () {
    console.log('Hello Gulp Other Task');
});

gulp.task('test', function () {
    console.log('test!!!!!!!!!!');
});

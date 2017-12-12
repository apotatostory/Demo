package com.example.demo;

import org.junit.Test;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class TestMongodb {

	@Test
	public void testMongodb() {
		try {
			// 连接到 mongodb 服务
			 MongoClient mongoClient = new MongoClient("127.0.0.1", 27017);
			// 根据mongodb数据库的名称获取mongodb对象 ,
			 MongoDatabase mongoDatabase = mongoClient.getDatabase("shop");
			MongoIterable<String> mongoIterable = mongoDatabase.listCollectionNames();

			// 打印出test中的集合
			for (String data : mongoIterable) {
				System.out.println("collectionName===" + data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
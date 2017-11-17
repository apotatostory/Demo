package com.example.utils;



import org.apache.log4j.Logger;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
/**
 * Praticing for connecting mongodb with Java
 * 
 * @author Tim
 *
 */
public class MongoDBUtils {
	static Logger logger = Logger.getLogger(MongoDBUtils.class.getName());

	public static void main(String args[]) {
		try {
			// Connect to mongodb server
			@SuppressWarnings("resource")
			MongoClient mongoClient = new MongoClient("localhost", 27017);

			// Connect to DB
			MongoDatabase mongoDatabase = mongoClient.getDatabase("shop");
			MongoCollection<?> mongoCollection = mongoDatabase.getCollection("USER");
			logger.info("=====mongoCollection: " + mongoCollection.count());
			logger.info("Connect to DB successfully!");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}

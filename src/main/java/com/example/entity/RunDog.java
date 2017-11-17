package com.example.entity;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jboss.logging.Logger;

import com.arjuna.ats.jta.TransactionManager;

public class RunDog {
	/***
	 * 學習OGM用的
	 */
	final static Logger logger = Logger.getLogger(RunDog.class);
	static javax.transaction.TransactionManager tm = TransactionManager.transactionManager();
	static EntityManagerFactory emf =Persistence.createEntityManagerFactory("ogm-jpa-tutorial");
	
	public static void main(String[] args) {
		
		logger.info("start!!");
	}
	
	

}

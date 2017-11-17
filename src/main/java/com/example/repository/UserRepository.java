package com.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
	/**
	 * 查詢firstName
	 * 
	 * @param firstname
	 * @return
	 */
	// @Query("{ 'FIRSTNAME' : ?1 }")
	// List<User> findByFirstName(String firstname);

	User findByFirstName(String firstName);

	List<User> findByLastName(String lastName);
}

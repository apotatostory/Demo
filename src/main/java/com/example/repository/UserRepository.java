package com.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	List<User> findByFirstName(String firstName);

	List<User> findByLastName(String lastName);
}

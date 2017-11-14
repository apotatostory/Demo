package com.example.Service;

import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.example.entity.User;
import com.example.repository.UserRepository;

/**
 * 實作UserController的功能
 * 
 * @author Tim
 *
 */
@PersistenceContext(unitName = "character")
public class UserService {
	Logger logger = Logger.getLogger(UserService.class.getName());
	private UserRepository userRepository;

	public User doFind() {
		User user = userRepository.findByFirstName("Tim");
		logger.info("=====user: " + user.toString());
		return user;
	}

	public User doSave(User user) {
		return userRepository.save(user);
	}

}

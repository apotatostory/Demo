package com.example.Service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

/**
 * 實作UserController的功能
 * 
 * @author Tim
 *
 */
@Service
public class UserService {
	Logger logger = Logger.getLogger(UserService.class.getName());
	
	@Autowired
	private UserRepository userRepository;

	public User doFind() {
		User user = userRepository.findByFirstName("Lee").get(0);
		logger.info("=====user: " + user.toString());
		return user;
	}

	public User doSave(User user) {
		return userRepository.save(user);
	}

}

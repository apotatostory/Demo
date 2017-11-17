package com.example.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Service.UserService;
import com.example.entity.User;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/User")
public class UserController {
	Logger logger = Logger.getLogger(UserController.class.getName());
	
	private final UserService userService;
	
	/**********************************************************************************
	 * 
	 * Constructor : 請勿修改
	 * 
	 **********************************************************************************/
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;

	}
	
	/**
	 * 查詢User全部資料
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/find")
	public User find() throws Exception {
		logger.info("##### test start!!! #####");

		User result = new User();

		try {
			result = userService.doFind();
		} catch (Exception e) {
			System.out.println("===== test Exception!!! =====");
			e.printStackTrace();
		}
		logger.info("##### test end!!! #####");
		return result;
	}

	/**
	 * 儲存User資料
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public User save() throws Exception {
		logger.info("##### save start!!! #####");

		User result = new User("Vivian", "Lee");

		try {
			userService.doSave(result);
		} catch (Exception e) {
			System.out.println("===== save Exception!!! =====");
			e.printStackTrace();
		}
		logger.info("##### save end!!! #####");
		return result;
	}

}

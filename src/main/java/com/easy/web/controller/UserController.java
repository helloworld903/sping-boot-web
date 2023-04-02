package com.easy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easy.web.model.User;
import com.easy.web.model.repository.UserRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/getUser")
	public User getuser(HttpServletRequest request) {
		User user=userRepository.findByUserName("myName");
		if(user!=null) {
			HttpSession session=request.getSession(true);
			session.setAttribute(user.getId().toString(), user.getNickName());
		}
		return user;
	}
	
	@RequestMapping("/getUsers")
	public List<User>getUsers(){
		List<User>users=userRepository.findAll();
		return users;
	}
}

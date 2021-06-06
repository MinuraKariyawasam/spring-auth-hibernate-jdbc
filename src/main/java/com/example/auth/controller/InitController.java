package com.example.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.auth.model.User;
import com.example.auth.repository.UserRepository;
import com.example.auth.service.UserService;

@RestController
@RequestMapping("api/v1")
public class InitController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public String init() {
		return "server is working";
	}
	
//	@GetMapping("/user")
//	public List<String> getUser() {
//		return userService.getUserName();
//	}
	
	@PostMapping("/user") // Map ONLY POST Requests
	public void addUser(@RequestBody User user){
		userRepository.save(user);
    }
	
	@GetMapping("/user")
	  public @ResponseBody Iterable<User> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return userRepository.findAll();
	  }
}

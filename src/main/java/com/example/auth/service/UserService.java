package com.example.auth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	List<String> userName = new ArrayList<String>();
	
	public UserService() {
		userName.add("Minura");
		userName.add("Banaka");
	}
	
	/*
	 * @param 0
	 * @return userName String arraylist
	 */
	
	public List<String> getUserName(){
		return userName;
	}

}

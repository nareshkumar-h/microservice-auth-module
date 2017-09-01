package com.naresh.authmodule.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public List<String> index() {
		System.out.println("UserController->index");
		List<String> userList = new ArrayList<>();
		userList.add("Naresh");
		userList.add("Siva");
		userList.add("Subash");
		userList.add("Murali");
		return userList;
	}
}

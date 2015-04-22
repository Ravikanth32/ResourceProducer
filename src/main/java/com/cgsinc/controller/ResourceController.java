package com.cgsinc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cgsinc.model.Resource;
import com.cgsinc.service.ResourceService;

@RestController
public class ResourceController {
	@Autowired
	ResourceService service;
	
	
	@RequestMapping("/getResource")
	@ResponseBody
	Resource getResource(){
		System.out.println("i am controller");
		Resource resource=service.getService();
		return resource;
	}
	
}

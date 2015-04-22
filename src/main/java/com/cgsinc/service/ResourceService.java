package com.cgsinc.service;

import org.springframework.stereotype.Service;

import com.cgsinc.model.Resource;


@Service
public class ResourceService {

	
	public Resource getService(){
		Resource resource=new Resource();
		resource.setId(1l);
		resource.setFileName("D://files/sample.txt");
		resource.setImageName("D://files/sample.jpg");
		resource.setUrlName("http://www.mkyong.com/java/how-to-get-url-content-in-java/");
		return resource;
		
	}
}

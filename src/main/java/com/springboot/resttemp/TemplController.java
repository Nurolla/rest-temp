package com.springboot.resttemp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.resttemp.service.ParsingService;

@RestController
@RequestMapping("/jsonurl")
public class TemplController {

	

	@Autowired
	private ParsingService parsingService;
	
	@Autowired
	private RestTemplate rt;

	@GetMapping("/geturl")
	public List<Object> getObjects() {
		String url="https://jsonplaceholder.typicode.com/posts";
		Object[] objs = rt.getForObject(url, Object[].class);
		
		return Arrays.asList(objs);	
	}


}

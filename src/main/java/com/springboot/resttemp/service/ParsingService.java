package com.springboot.resttemp.service;

import org.springframework.stereotype.Service;

@Service
public interface ParsingService {
	
	Object parse(String url);

}

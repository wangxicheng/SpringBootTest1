package com.cdvcloud.springbootTest1.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebTest1 {

	/*@Autowired
	private ConfigTest configTest;*/
	@Value("${test.myself}")
	private String myself;
	
	@RequestMapping(value={"/"},produces="text/plain;charset=UTF-8")
	public String index() {
		return "Hello This Is My SpringBoot Project ! " + myself;
	}
}

package com.cdvcloud.springbootTest1;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MySpringBootTest1 {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootTest1.class, args);
		
		//修改Banner的模式为OFF
		/*SpringApplicationBuilder builder = new SpringApplicationBuilder(MySpringBootTest1.class);
        builder.bannerMode(Mode.OFF).run(args);*/
	}
}

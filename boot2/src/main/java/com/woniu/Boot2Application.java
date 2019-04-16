package com.woniu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@MapperScan("com.woniu.mapper")
public class Boot2Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot2Application.class, args);
	
	}

}

package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan
@ComponentScan(basePackages="boardmapper")
@MapperScan(basePackages="boardmapper")

@ComponentScan(basePackages="db_jasypt")
public class GithugProjectApplication {

	public static void main(String[] args) {
		//tomcat server 실행
		SpringApplication.run(GithugProjectApplication.class, args);
		System.out.println("github 연동 프로젝트 실험");
	}

}

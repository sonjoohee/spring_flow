package com.example.spring_flow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class SpringFlowApplication {

	//서버기동(AWS - tomcat: 8080 - 포트변경 가능(yml에서)))
	//jar packing, java - jar xxxxxxx.jar

	public static void main(String[] args) {
		SpringApplication.run(SpringFlowApplication.class, args);
	}

}

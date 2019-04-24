package com.imooc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class GirlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GirlApplication.class, args);
	}
	@Value("${server.port}")
	private int port;

	@GetMapping("/hi/{name}")
	public String hello(@PathVariable String name){
		return "hi" + name + "I , am from port:" + port +"I,am up";
	}
}

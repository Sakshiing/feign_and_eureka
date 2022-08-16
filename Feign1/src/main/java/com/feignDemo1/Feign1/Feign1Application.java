package com.feignDemo1.Feign1;
//import org.springframework.boot.autoconfigure.Enable
import org.springframework.boot.*;
import org.springframework.boot.web.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableEurekaClient

@SpringBootApplication

public class Feign1Application {

	public static void main(String[] args) {
		SpringApplication.run(Feign1Application.class, args);
	}

}

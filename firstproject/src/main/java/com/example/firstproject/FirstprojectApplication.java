package com.example.firstproject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstprojectApplication.class, args);
		System.out.println("Hello Springboot.....");
		Alien a = context.getBean(Alien.class);
		a.show();
	}

}

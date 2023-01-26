package com.tech.first;

import com.tech.first.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstApplication.class, args);

		User user=new User();
		user.setAge(22);
		user.setName("Aman");
		user.setId(1);
		System.out.println("user Details"+user.toString());
		System.out.println("use name="+user.getName());
		System.out.println("use id="+user.getId());
		System.out.println("use age="+user.getAge());
	}

}

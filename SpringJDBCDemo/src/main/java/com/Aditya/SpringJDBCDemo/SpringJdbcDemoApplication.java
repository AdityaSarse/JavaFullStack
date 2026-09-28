package com.Aditya.SpringJDBCDemo;
import com.Aditya.SpringJDBCDemo.repository.DevRepo;

import com.Aditya.SpringJDBCDemo.repository.DevRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Devs dev1 = context.getBean(Devs.class) ;
		dev1.setId(104);
		dev1.setName("Ashish");
		dev1.setTech("Tally");

		DevRepo repo = context.getBean(DevRepo.class);
		repo.save(dev1);
		System.out.println(repo.findall());
	}

}

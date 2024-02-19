package com.cursojava.demo;

import com.cursojava.demo.model.Laptop;
import com.cursojava.demo.model.Programmer;
import com.cursojava.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

//		Programmer obj = context.getBean(Programmer.class);
//		System.out.println(obj.getAge());
//		obj.code();
	}

}

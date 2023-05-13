package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

	@GetMapping
	public String message() {
		//String styledMessage = "<div style=\"font-weight: bold; background-color: red;\">Hello world this sukhanth</div>";
		String styledMessage = "<html><head><title>Hello World</title><style>html,body {height:100%;margin:0;}head {display:flex;align-items:center;justify-content:center;flex-direction:column;}</style></head><body style='background-color:lightblue;padding:20px'><h1 style='color:green;text-align:center'>Hello World! This is Sukhanth</h1><h2 style='color:#00008B;text-align:center'>This is Jenkins CI CD Pipeline Java SpringBoot Application <span style='color:red'>Version:4</span></h2></body></html>";		
    		return styledMessage;
}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}

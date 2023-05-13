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
	    String boldText = "\u001B[1mHello world this sukhanth\u001B[0m";
	    String coloredBackground = "\u001B[43m" + boldText + "\u001B[0m";
	    return coloredBackground;
}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}

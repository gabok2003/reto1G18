package co.edu.usa.miproyectog18.reto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Reto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto1Application.class, args);
	}

}

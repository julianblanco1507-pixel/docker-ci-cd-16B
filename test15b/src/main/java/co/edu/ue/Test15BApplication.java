package co.edu.ue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.Entity;

@SpringBootApplication
@Entity 
public class Test15BApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test15BApplication.class, args);
	}

}

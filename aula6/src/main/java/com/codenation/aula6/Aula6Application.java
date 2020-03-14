package com.codenation.aula6;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Aula6Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula6Application.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRuner() {
//		return args -> {
//			System.out.println("----- Funcionando -----");
//		};
//	}

}

package com.example.Szakdolgozat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
		org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration.class,
		org.springframework.boot.hibernate.autoconfigure.HibernateJpaAutoConfiguration.class
})
public class SzakdolgozatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SzakdolgozatApplication.class, args);
	}
}
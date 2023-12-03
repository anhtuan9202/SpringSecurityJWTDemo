package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(
//			AuthenticationService service
//	){
//		return args ->{
//			var admin = RegisterRequest.builder()
//					.firstName("Admin")
//					.lastName("Admin")
//					.email("admin@gmail.com")
//					.password("password")
//					.role(Role.ADMIN)
//					.build();
//			System.out.println("Admin token:" + service.register(admin).getToken());
//			var manager = RegisterRequest.builder()
//					.firstName("Manager")
//					.lastName("Manager")
//					.email("manager@gmail.com")
//					.password("password")
//					.role(Role.MANAGER)
//					.build();
//			System.out.println("Manager token:" + service.register(manager).getToken());
//		};
//	}

}

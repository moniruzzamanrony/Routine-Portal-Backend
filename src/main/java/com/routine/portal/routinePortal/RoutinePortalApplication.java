package com.routine.portal.routinePortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RoutinePortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutinePortalApplication.class, args);
	}

}

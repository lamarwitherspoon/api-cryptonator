package io.lamar.cryptonatorAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CryptonatorApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptonatorApiApplication.class, args);
	}
}

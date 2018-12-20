package fr.autostopfrance.Autostop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class AutostopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutostopApplication.class, args);
	}
}

package com.quan.events;

import com.quan.events.publisher.Gpay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringEventsAnnotationApplication implements CommandLineRunner {

	@Autowired
	private Gpay gpay;

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(SpringEventsAnnotationApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		gpay.sendMoney("Quan", 10, true);

	}
}

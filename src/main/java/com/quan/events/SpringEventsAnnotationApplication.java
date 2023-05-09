package com.quan.events;

import com.quan.events.config.AppConfig;
import com.quan.events.publisher.ZeeCafePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringEventsAnnotationApplication {


	public static void main(String[] args) {
//		SpringApplication.run(SpringEventsAnnotationApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ZeeCafePublisher publisher = context.getBean(ZeeCafePublisher.class);
		publisher.streamBingBangTheory("EP - 004");






	}

}

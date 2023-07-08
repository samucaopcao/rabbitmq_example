package br.com.study.rabbitmq_example;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabbitmqExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqExampleApplication.class, args);
	}

}

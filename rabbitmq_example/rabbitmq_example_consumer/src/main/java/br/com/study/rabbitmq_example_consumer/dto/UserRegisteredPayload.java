package br.com.study.rabbitmq_example_consumer.dto;

public record UserRegisteredPayload(String fullName, String emailAddress, int confirmationCode) {

}
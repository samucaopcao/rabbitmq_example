package br.com.study.rabbitmq_example.dto;

public record UserRegisteredPayload (String fullName, String emailAddress, int confirmationCode) {

}
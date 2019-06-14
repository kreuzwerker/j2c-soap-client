package com.springboot.soapclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import movies.wsdl.GetMovieByIdResponse;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
		MovieClient client = context.getBean(MovieClient.class);
		GetMovieByIdResponse response = client.GetMovieById(new Long(103));
		System.out.println("response: Movie id=" + response.getMovieType().getMovieId() + ", title="
				+ response.getMovieType().getTitle() + ", category=" + response.getMovieType().getCategory());
	}

}

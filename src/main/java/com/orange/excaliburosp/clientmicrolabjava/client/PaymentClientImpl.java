package com.orange.excaliburosp.clientmicrolabjava.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import com.orange.excaliburosp.clientmicrolabjava.model.ReponsePayment;

import reactor.core.publisher.Mono;

@Component
public class PaymentClientImpl implements IPaymentClient {

	@Value("${env.caas.base-url}")
	private String baseUrl;
	
	@Value("${env.caas.endpoint.retrieve-payment}")
	private String retrievePayment;
	
	private WebClient.Builder webClientBuilder;

	public PaymentClientImpl(Builder webClientBuilder) {		
		this.webClientBuilder = webClientBuilder;
	}

	@Override
	public ReponsePayment getAllPayment() {
		WebClient webClient = this.webClientBuilder.baseUrl(baseUrl).build();
		
		Mono<ReponsePayment> result = webClient.get()				
				.uri(uriBuilder -> uriBuilder.path(retrievePayment).build())
				.header("Accept", MediaType.APPLICATION_JSON_VALUE)
				.retrieve()
				.onStatus(HttpStatus::is4xxClientError,
						response -> Mono.error(new HttpClientErrorException(response.statusCode())))
				.onStatus(HttpStatus::is5xxServerError,
						response -> Mono.error(new HttpClientErrorException(response.statusCode())))
				.bodyToMono(ReponsePayment.class);
		return result.block();	
		
	}
	
}

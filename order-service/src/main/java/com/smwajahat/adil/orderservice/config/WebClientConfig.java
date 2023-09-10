package com.smwajahat.adil.orderservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;


/**
 * @author Syed Muhammad Wajahat
 * Creation date: 08/09/2023
 */
@Configuration
public class WebClientConfig {
  @Bean
  @LoadBalanced
  public WebClient.Builder webClientBuilder(){
    return WebClient.builder();

  }

}

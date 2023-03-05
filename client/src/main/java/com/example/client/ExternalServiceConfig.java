package com.example.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.*;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class ExternalServiceConfig {

  private final DemoIntegrationProperties demoIntegrationProperties;

  @Bean
  @Primary
  public RestTemplate restTemplate() {
    log.info("Setting rootUri to {}", demoIntegrationProperties.getRootUri());
    return new RestTemplateBuilder()
      .rootUri(demoIntegrationProperties.getRootUri())
      .build();
  }

}

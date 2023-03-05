package com.example.client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class ClientController {

  private final RestTemplate restTemplate;
  private final DemoIntegrationProperties demoIntegrationProperties;

  @GetMapping("/local")
  public String getLocalMessage() {
    return this.demoIntegrationProperties.getMessage();
  }

  @GetMapping("/external")
  public String getExternalMessage() {
    final var response = restTemplate.getForEntity("/external", String.class);
    return response.getBody();
  }
}

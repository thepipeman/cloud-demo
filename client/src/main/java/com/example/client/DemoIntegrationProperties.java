package com.example.client;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "integration.demo")
public class DemoIntegrationProperties {
  private String rootUri;
  private String message;
}

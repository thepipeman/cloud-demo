package com.example.externalservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/external")
public class TestController {

  @Value("${demo.external.message}")
  private String message;

  @GetMapping
  public String getMessage() {
    return this.message;
  }

}

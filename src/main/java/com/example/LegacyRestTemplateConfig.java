package com.example;

import java.util.function.Supplier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplateBuilder の旧式サンプル（Before）
 * - Boot 2.x では requestFactory(Supplier<ClientHttpRequestFactory>) を使用
 * - Boot 3.2 へ移行すると requestFactoryBuilder() ベースに置換される（OpenRewriteが対応）
 */
@Configuration
public class LegacyRestTemplateConfig {

  @Bean
  RestTemplate restTemplate(RestTemplateBuilder builder) {
    Supplier<ClientHttpRequestFactory> supplier = SimpleClientHttpRequestFactory::new;

    return builder
        .requestFactory(supplier)
        .build();
  }
}
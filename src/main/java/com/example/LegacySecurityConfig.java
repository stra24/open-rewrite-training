package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Security の旧式サンプル（Before）
 * - WebSecurityConfigurerAdapter（廃止予定）
 * - authorizeRequests + antMatchers（→ SpringBoot 3 / SpringSecurity 6 では requestMatchers へ）
 */
@Configuration
@EnableWebSecurity
public class LegacySecurityConfig {

  @Bean
  SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests(requests -> requests
            .requestMatchers("/admin/**").authenticated()
            .anyRequest().permitAll());
    return http.build();
  }
}
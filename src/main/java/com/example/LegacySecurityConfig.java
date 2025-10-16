package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Security の旧式サンプル（Before）
 * - WebSecurityConfigurerAdapter（廃止予定）
 * - authorizeRequests + antMatchers（→ SpringBoot 3 / SpringSecurity 6 では requestMatchers へ）
 */
@Configuration
@EnableWebSecurity
public class LegacySecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .antMatchers("/admin/**").authenticated()
        .anyRequest().permitAll();
  }
}
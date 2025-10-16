package com.example;

import java.util.concurrent.Executor;
import org.springframework.boot.task.TaskExecutorBuilder; // ← 旧型名（移行後は ThreadPoolTaskExecutorBuilder）
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TaskExecutor の旧式サンプル（Before）
 * - TaskExecutorBuilder を使用（SpringBoot 3 系では ThreadPoolTaskExecutorBuilder へ置換）
 */
@Configuration
public class LegacyExecutorConfig {

  @Bean
  Executor executor(TaskExecutorBuilder builder) {
    return builder.build();
  }
}
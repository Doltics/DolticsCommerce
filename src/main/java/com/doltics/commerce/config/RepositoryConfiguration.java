package com.doltics.commerce.config;

import java.util.concurrent.Executor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.doltics.commerce")
@EnableJpaRepositories(basePackages = { "com.doltics.commerce.repository" })
@EnableJpaAuditing
@EnableTransactionManagement
@EnableScheduling
@EnableAsync
public class RepositoryConfiguration {

	@Value("${doltics.async.threads.pool.core_size}")
	private int corePoolsize;

	@Value("${doltics.async.threads.pool.pool_size}")
	private int maxPoolSize;
	
	@Value("${doltics.async.threads.pool.capacity}")
	private int queueCapacity;

	@Bean(name = "asyncExecutor")
	public Executor asyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(corePoolsize);
		executor.setMaxPoolSize(maxPoolSize);
		executor.setQueueCapacity(queueCapacity);
		executor.setThreadNamePrefix("AsynchThread-");
		executor.initialize();
		return executor;
	}
}

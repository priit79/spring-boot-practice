package com.sda.study.springbootpractice.configurations;

import com.sda.study.springbootpractice.handlers.AuditAwareHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Configuration for auditing
 *
 * @author Priit Enno
 * @Date 27.02.2023
 */

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class AuditConfiguration {
    @Bean
    public AuditorAware<String> auditorAware() {
        return new AuditAwareHandler();


    }
}
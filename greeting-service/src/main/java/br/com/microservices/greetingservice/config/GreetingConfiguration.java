package br.com.microservices.greetingservice.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties("greeting-service")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GreetingConfiguration {

    private String greeting;
    private String defaultValue;

}

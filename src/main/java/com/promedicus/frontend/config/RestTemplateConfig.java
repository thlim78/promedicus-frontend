package com.promedicus.frontend.config;

import com.promedicus.frontend.interceptor.RestTemplateInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tolim on 3/07/2018.
 */
@SpringBootConfiguration
@EnableAutoConfiguration
@Slf4j
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {

        log.info("Creating rest template");
        RestTemplate restTemplate = restTemplateBuilder
                .build();

        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
        interceptors.add(new RestTemplateInterceptor());
        restTemplate.setInterceptors(interceptors);
        log.info("Rest template created");
        return restTemplate;
    }
}
package com.promedicus.frontend.service;

import com.promedicus.frontend.model.Admission;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.List;

/**
 * Created by tolim on 10/08/2018.
 */
public interface AdmissionService {
    List<Admission> list();
    Admission get(Long id);
    Admission create(Admission admission);
    void update(Long id, Admission source);
    void delete(Long id);

    @Service
    @Slf4j
    class Default implements AdmissionService {

        private final RestTemplate restTemplate;

        @Value("${backend.baseURL}")
        private String baseURL;

        public Default(RestTemplate restTemplate) {
            this.restTemplate = restTemplate;
        }

        public List<Admission> list() {
            String url = baseURL + "/";
            ResponseEntity<List<Admission>> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Admission>>(){});
            return response.getBody();
        }

        public Admission get(Long id) {
            String url = baseURL + "/{id}";
            HashMap<String, Object> params = new HashMap<>();
            params.put("id", id.toString());
            ResponseEntity<Admission> response = restTemplate.getForEntity(url, Admission.class, params);
            return response.getBody();
        }

        public Admission create(Admission admission) {
            String url = baseURL + "/";
            HttpEntity<Admission> request = new HttpEntity<>(admission);
            ResponseEntity<Admission> response = restTemplate.postForEntity(url, admission, Admission.class);
            return response.getBody();
        }

        public void update (Long id, Admission source) {
            String url = baseURL + "/{id}";
            HashMap<String, Object> params = new HashMap<>();
            params.put("id", id.toString());
            HttpEntity<Admission> request = new HttpEntity<>(source);
            restTemplate.put(url, request, params);
        }

        public void delete (Long id) {
            String url = baseURL + "/{id}";
            HashMap<String, Object> params = new HashMap<>();
            params.put("id", id.toString());
            restTemplate.delete(url, params);
        }
    }
}

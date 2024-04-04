package com.api.rest.springboot.webflux.repositories;

import com.api.rest.springboot.webflux.documents.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, String> {
}

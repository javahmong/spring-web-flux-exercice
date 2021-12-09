package ch.javahmong.service;

import ch.javahmong.model.Product;
import reactor.core.publisher.Mono;

import java.util.List;

public interface JavaHmongService {
    Mono<List<Product>> findAll();
    Mono<Product> saveProduct(Product product);

}

package ch.javahmong.service;

import ch.javahmong.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JavaHmongServiceImpl implements JavaHmongService {

    @Override
    public Mono<List<Product>> findAll() {
        return Mono.empty();
    }

    @Override
    public Mono<Product> saveProduct(Product product) {
        return Mono.empty();
    }
}

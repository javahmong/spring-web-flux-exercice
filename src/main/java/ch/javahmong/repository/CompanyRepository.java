package ch.javahmong.repository;

import ch.javahmong.model.Company;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CompanyRepository extends ReactiveCrudRepository<Company, Long> {
    Mono<Company> findCompanyByCode(String code);
}

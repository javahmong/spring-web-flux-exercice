package ch.javahmong;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.r2dbc.core.DatabaseClient;

import java.time.LocalDateTime;

@SpringBootApplication
@Log4j2
public class JavaHmongApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaHmongApplication.class, args);
    }

    @Bean
    ApplicationRunner init(DatabaseClient client) {
        return args -> {

            client.sql("create table IF NOT EXISTS company" +
                    "(id SERIAL PRIMARY KEY,code varchar (255) not null, name varchar (255) not null, creation_date datetime not null);").fetch().first().subscribe();
            client.sql("create table IF NOT EXISTS product" +
                    "(id SERIAL PRIMARY KEY, id_company int not null constraint product_company_id_fk references company, " +
                    "code varchar (255) not null, name varchar (255) not null, price decimal not null, creation_date datetime not null);").fetch().first().subscribe();



            client.sql("DELETE FROM product;").fetch().first().subscribe();
            client.sql("DELETE FROM company;").fetch().first().subscribe();
            client.sql("INSERT INTO company(code, name, creation_date) values ('COMP1', 'Company1', '" + LocalDateTime.now() + "');").fetch().first().subscribe();
            client.sql("INSERT INTO product(id_company, code, name, price, creation_date) values (1, 'P1', 'Product1' , 10, '" + LocalDateTime.now() + "');").fetch().first().subscribe();
            client.sql("INSERT INTO product(id_company, code, name, price, creation_date) values (1, 'P2', 'Product2', 5, '" + LocalDateTime.now() + "');").fetch().first().subscribe();
            client.sql("INSERT INTO product(id_company, code, name, price, creation_date) values (1, 'P3', 'Product2', 7,'" + LocalDateTime.now() + "');").fetch().first().subscribe();


        };
    }
}

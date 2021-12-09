package ch.javahmong.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table("product")
public class Product {
    @Id
    private Long id;
    private Long idCompany;
    private String code;
    private String name;
    private Double price;
    private LocalDateTime creationDate;

    @Transient
    private Company company;

}

package ch.javahmong.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {
    private String idCompany;
    private String code;
    private String name;
    private Double price;
    private LocalDateTime creationDate;
    private CompanyDTO company;
}

package ch.javahmong.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompanyDTO {
    private String code;
    private String name;
    private LocalDateTime creationDate;
}

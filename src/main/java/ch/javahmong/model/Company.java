package ch.javahmong.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table("company")
public class Company {
    @Id
    private Long id;
    private String code;
    private String name;
    private LocalDateTime creationDate;

}

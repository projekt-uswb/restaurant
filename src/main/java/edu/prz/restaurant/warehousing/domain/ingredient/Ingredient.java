package edu.prz.restaurant.warehousing.domain.ingredient;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Ingredient {

    @Id
    private Long id;

    private String name;
    private LocalDate expirationDate;
    private String warehouseName;
    private String allergenName;
}

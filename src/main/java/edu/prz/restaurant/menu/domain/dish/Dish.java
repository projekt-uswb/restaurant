package edu.prz.restaurant.menu.domain.dish;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Dish {

    @Id
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private String category;
}

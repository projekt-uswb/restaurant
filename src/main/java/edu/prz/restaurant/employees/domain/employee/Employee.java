package edu.prz.restaurant.employees.domain.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Employee {

    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private String position;
    private String restaurantName;
}

package edu.prz.restaurant.customer.domain.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customer {

    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
}

package edu.prz.restaurant.network.domain.restaurantchain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class RestaurantChain {

    @Id
    private Long id;

    private String name;
    private String description;
    private String contactPhoneNumber;
    private String headquartersAddress;
}

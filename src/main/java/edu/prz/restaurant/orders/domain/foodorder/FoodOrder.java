package edu.prz.restaurant.orders.domain.foodorder;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class FoodOrder {

  @Id
  Long id;

  String description;

}

package edu.prz.restaurant.orders.domain.foodorder;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodOrder {

  @Id
  Long id;

  String description;

}

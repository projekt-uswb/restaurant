package edu.prz.restaurant.delivery.domain.delivery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Delivery {

    @Id
    private Long id;

    private String deliveryAddress;
    private LocalDateTime deliveryDateTime;
    private String status;
    private BigDecimal deliveryCost;
}

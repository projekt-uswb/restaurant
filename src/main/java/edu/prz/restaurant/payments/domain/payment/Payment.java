package edu.prz.restaurant.payments.domain.payment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Payment {

    @Id
    private Long id;

    private BigDecimal amount;
    private String paymentMethod;
    private String status;
    private LocalDate paymentDate;
}

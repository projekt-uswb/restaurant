package edu.prz.restaurant.reservations.domain.reservation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Reservation {

    @Id
    private Long id;

    private LocalDate reservationDate;
    private LocalTime reservationTime;
    private Integer numberOfPeople;
    private String status;
}

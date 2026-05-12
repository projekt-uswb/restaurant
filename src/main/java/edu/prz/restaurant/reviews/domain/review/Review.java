package edu.prz.restaurant.reviews.domain.review;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Review {

    @Id
    private Long id;

    private Integer rating;
    private String comment;
    private LocalDate reviewDate;
}

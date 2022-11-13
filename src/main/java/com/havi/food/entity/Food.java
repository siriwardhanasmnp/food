package com.havi.food.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long imageUrl;
    private Integer imageCount;
    private LocalDateTime addedTime;
    private Integer quantity;
    private LocalDateTime canceledTime;
    private String availableStatus;
}

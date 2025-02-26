package com.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bookingreview")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Review extends BaseModel{

    @Column(nullable = false)
    private String content;

    private Double rating;
}

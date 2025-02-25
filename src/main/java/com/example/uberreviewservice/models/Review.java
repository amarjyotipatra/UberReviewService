package com.example.uberreviewservice.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "bookingreview")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Identity is auto-incremented
    Long id;

    @Column(nullable = false)
    String content;

    Double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    @LastModifiedDate
    Date updatedAt;
}

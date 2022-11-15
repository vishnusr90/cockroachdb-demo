package com.example.cockroachdb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class Product {

    @Id
    String id;

    String name;

    String description;

    Instant createdOn;

    Instant modifiedOn;

}
package com.example.cockroachdb.entity;

import com.example.cockroachdb.dto.ProductDto;

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

    public ProductDto entityToDto() {
        return ProductDto.builder()
                .name(this.name)
                .description(this.description)
                .build();
    }

}
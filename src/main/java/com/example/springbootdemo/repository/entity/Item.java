package com.example.springbootdemo.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
// import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter @Setter @Column(nullable = false)
    private String name;

    @Getter @Setter @Column(nullable = false)
    private String description;

    @Getter @Setter @Column(nullable = false)
    private String imageUrl;

    public Item(String name, String description, String imageUrl){
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }
}


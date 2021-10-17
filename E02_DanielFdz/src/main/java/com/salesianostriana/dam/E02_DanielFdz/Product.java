package com.salesianostriana.dam.E02_DanielFdz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product", schema = "schema")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @GeneratedValue()
    @Column(name = "name", nullable = false)
    private String name;

    @Column( name = "price", nullable = false)
    private Double price;

    @Column(name = "image")
    private String image;
    @Column(name = "description")
    private String description;

    public Product(String name, Double price, String image, String description) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.description = description;
    }
}

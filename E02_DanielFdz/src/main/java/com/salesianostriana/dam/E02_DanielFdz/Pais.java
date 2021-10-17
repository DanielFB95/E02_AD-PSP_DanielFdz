package com.salesianostriana.dam.E02_DanielFdz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "country", schema = "schema")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }
}

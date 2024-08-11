package com.example.foodapp.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cafeterias")
public class Cafeteria {
    /*@SequenceGenerator(
            name = "cafeteria_sequence",
            sequenceName = "cafeteria_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cafeteria_sequence"
    )*/
 // rather than using sequence, we can just depend upon the database's auto increment feature
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    @Id

    @Column(
            name = "cafeteria_id",
            updatable = false,
            unique = true
    )
    private Long id;

    @Column(
            name = "cafeteria_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;

    @OneToMany(mappedBy = "cafeteria", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Food> foods;

    public Cafeteria(Long id,
                     String name,
                     Set<Food> foods) {
        this.id = id;
        this.name = name;
        this.foods = foods;
    }

    public Cafeteria() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Set<Food> getFoods() {
        return foods;
    }

    public void setFoods(Set<Food> foods) {
        this.foods = foods;
    }
    // Getters and setters

    @Override
    public String toString() {
        return "Cafeteria{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foods=" + foods +
                '}';
    }
}


package com.carokuba.musicapp;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Song {
    @Id
    private Integer id;

    @Column(name="name")
    private String name;

}

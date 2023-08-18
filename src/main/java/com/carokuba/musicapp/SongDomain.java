package com.carokuba.musicapp;

public class SongDomain {
    private String name;
    private SongDomain(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

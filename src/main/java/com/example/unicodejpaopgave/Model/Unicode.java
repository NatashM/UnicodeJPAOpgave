package com.example.unicodejpaopgave.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int unicode;
    private char letter;
    private String name;

    private String description;


    Unicode(int unicode, char letter,String name, String description){
        this.unicode = unicode;
        this.letter = letter;
        this.name = name;
        this.description = description;
    }

    public Unicode() {

    }

    public Unicode(String string) {
    }


    public int getId() {
        return id;
    }

    public int getUnicode() {
        return unicode;
    }

    public char getLetter() {
        return letter;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

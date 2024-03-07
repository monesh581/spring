package com.example.demosprintsql.practice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class user {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
private String name;
private String email;


public int getId(){
    return id;
}
public String getName(){
    return name;
}

public String getEmail(){
    return  getEmail();
}


public void setName(String name){
    this.name=name;

}
void setId(int id){
    this.id=id;
}

    public void setEmail(String email) {
    }
}

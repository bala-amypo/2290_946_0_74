package com.example.demo.entity;


public class Student{
    private Long id;
    private String name;
    private String email;
    private float cgpa;

    public Long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public voide setEmail(){
        this.email=email;
    }
    
}
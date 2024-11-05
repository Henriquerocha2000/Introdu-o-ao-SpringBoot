package com.devsuperior.demo.entites;

public class Department {

    private long Id;
    private String name;

    public Department(){

    }
    
    public Department(long id, String name) {
        Id = id;
        this.name = name;
    }
    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

}

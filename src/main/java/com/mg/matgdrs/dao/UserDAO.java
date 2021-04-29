package com.mg.matgdrs.dao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDAO {

    private Long id;

    private String Name;

    public UserDAO(Long id, String name) {
        this.id = id;
        Name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
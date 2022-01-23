package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "topic")
public class Topic {

    @Id
    @NotBlank
    private String id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

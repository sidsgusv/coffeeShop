package com.example.coffeeshopapl.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity{

    //•	Has a Name
    //o	An option between (Coffee, Cake, Drink, Other)
    //•	Has a Needed Time (just an integer)

    private CategoryNameEnum name;
    private Integer neededTime;

    public Category() {
    }
@Enumerated(EnumType.STRING)
    public CategoryNameEnum getName() {
        return name;
    }

    public Category setName(CategoryNameEnum name) {
        this.name = name;
        return this;
    }
@Column(nullable = false)
    public Integer getNeededTime() {
        return neededTime;
    }

    public Category setNeededTime(Integer neededTime) {
        this.neededTime = neededTime;
        return this;
    }
}

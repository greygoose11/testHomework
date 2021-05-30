package com.example.testHomework.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Persons")
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String lastName;
    private String firstName;
    private String address;
    private String city;
    private int age;



}

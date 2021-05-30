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

//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getCity() {
//        return city;
//    }

}

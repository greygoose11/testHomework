package com.example.testHomework.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Roots")
public class Root {

        @Id
        @GeneratedValue
        private long id;

        private String name;

        @OneToMany
        private List<Person> personList;

        @Override
        public String toString() {
            return "Root{" +
                    "name='" + name + '\'' +
                    ", personList=" + personList +
                    '}';
        }
    }

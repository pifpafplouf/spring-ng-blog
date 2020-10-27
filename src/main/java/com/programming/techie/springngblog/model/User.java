package com.programming.techie.springngblog.model;


import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
}

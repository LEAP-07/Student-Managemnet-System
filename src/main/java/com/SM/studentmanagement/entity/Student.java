package com.SM.studentmanagement.entity;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = true)
    private String lastName;
    @Column(name = "email", nullable = false)
    private String email;

//    @OneToOne(cascade = CascadeType.ALL,   fetch = FetchType.EAGER)
//    @JoinColumn(name = "address_id", referencedColumnName = "add_id")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(){

    }
    public Student(String firstName, String lastName,String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}

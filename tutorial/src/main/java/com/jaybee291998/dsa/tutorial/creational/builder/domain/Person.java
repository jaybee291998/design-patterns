package com.jaybee291998.dsa.tutorial.creational.builder.domain;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthday;
    private String email;
    private String phoneNumber;

    public Person(String middleName, String firstName, String lastName, String email, LocalDate birthday, String phoneNumber) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("firstName and lastName is mandatory");
        }

        this.middleName = middleName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

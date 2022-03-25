package com.kirill.boot_rest.entity;

import javax.persistence.*;

@Entity
@Table(name = "dev_employees")
public class DevEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "grade")
    private String grade;

    @Column(name = "pl")
    private String pl;

    @Column(name = "salary")
    private int salary;

    @Column(name = "location")
    private Integer location;

    @Column(name = "phone")
    private String phoneNumber;

    public DevEmployee() {
    }


    public DevEmployee(String name, String surname, String grade, String pl, int salary, Integer location, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.pl = pl;
        this.salary = salary;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade='" + grade + '\'' +
                ", pl='" + pl + '\'' +
                ", salary=" + salary +
                ", location=" + location +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

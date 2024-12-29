package com.CricBuzz.cricbuss.model;

import com.CricBuzz.cricbuss.model.Enum.Gender;
import com.CricBuzz.cricbuss.model.Enum.Speciality;
import jakarta.persistence.*;
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int age;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @Enumerated(EnumType.STRING)
    Speciality speciality;

    String email;

    @ManyToOne
    @JoinColumn
    Team team;

    @OneToOne(mappedBy = "player",cascade = CascadeType.ALL)
    Status status;
    public Player(){};

    public Player(int id, String name, int age, Gender gender, Speciality speciality, String email, Team team, Status status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.speciality = speciality;
        this.email = email;
        this.team = team;
        this.status = status;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
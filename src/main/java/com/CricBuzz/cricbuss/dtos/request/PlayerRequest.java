package com.CricBuzz.cricbuss.dtos.request;

import com.CricBuzz.cricbuss.model.Enum.Gender;
import com.CricBuzz.cricbuss.model.Enum.Speciality;

public class PlayerRequest {
    String name;

    int age;

    Gender gender;

    Speciality speciality;

    String email;
    public PlayerRequest(){};

    public PlayerRequest(String name, int age, Gender gender, Speciality speciality, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.speciality = speciality;
        this.email = email;
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
}

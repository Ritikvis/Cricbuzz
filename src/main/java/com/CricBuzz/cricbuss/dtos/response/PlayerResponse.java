package com.CricBuzz.cricbuss.dtos.response;

import com.CricBuzz.cricbuss.model.Enum.Speciality;

public class PlayerResponse {
    String name;
    Speciality speciality;
    public PlayerResponse(){};

    public PlayerResponse(String name, Speciality speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}

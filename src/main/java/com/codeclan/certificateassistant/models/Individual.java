package com.codeclan.certificateassistant.models;

import jakarta.persistence.*;

@Entity
@Table(name = "individuals")
public class Individual extends Client{
    private String jurisdiction;

    public Individual(String clientNumber, String name, String industry, boolean faceToFace, boolean pep, User user, String jurisdiction) {
        super(clientNumber, name, industry, faceToFace, pep, user);
        this.jurisdiction = jurisdiction;
    }

    public Individual() {
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

}

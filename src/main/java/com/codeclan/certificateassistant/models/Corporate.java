package com.codeclan.certificateassistant.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "corporates")
public class Corporate extends Client{

    @Column(name = "incorporated_jurisdiction")
    private String incorporatedJurisdiction;

    @Column(name = "ownership_jurisdictions")
    private List<String> ownershipJurisdictions;

    @Column(name = "pep_jurisdictions")
    private List<String> pepJurisdictions;

    private boolean trust;

    public Corporate(String clientNumber, String name, String industry, boolean faceToFace, boolean pep, User user, String incorporatedJurisdiction, List<String> ownershipJurisdictions, List<String> pepJurisdictions, boolean trust) {
        super(clientNumber, name, industry, faceToFace, pep, user);
        this.incorporatedJurisdiction = incorporatedJurisdiction;
        this.ownershipJurisdictions = ownershipJurisdictions;
        this.pepJurisdictions = pepJurisdictions;
        this.trust = trust;
    }

    public Corporate() {
    }

    public String getIncorporatedJurisdiction() {
        return incorporatedJurisdiction;
    }

    public void setIncorporatedJurisdiction(String incorporatedJurisdiction) {
        this.incorporatedJurisdiction = incorporatedJurisdiction;
    }

    public List<String> getOwnershipJurisdictions() {
        return ownershipJurisdictions;
    }

    public void setOwnershipJurisdictions(List<String> ownershipJurisdictions) {
        this.ownershipJurisdictions = ownershipJurisdictions;
    }

    public List<String> getPepJurisdictions() {
        return pepJurisdictions;
    }

    public void setPepJurisdictions(List<String> pepJurisdictions) {
        this.pepJurisdictions = pepJurisdictions;
    }

    public boolean isTrust() {
        return trust;
    }

    public void setTrust(boolean trust) {
        this.trust = trust;
    }
}

package com.codeclan.certificateassistant.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_number")
    private String clientNumber;
    private String name;

    private String industry;
    private String jurisdiction;

    @Column(name = "face_to_face")
    private boolean faceToFace;
    private boolean pep;

    @Column(name = "ownership_jurisdictions")
    private List<String> ownershipJurisdictions;

    @Column(name = "pep_jurisdictions")
    private List<String> pepJurisdictions;

    private String clientType;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnoreProperties({"clients"})
    private User user;

    @JsonIgnoreProperties({"client"})
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<Matter> matters;

    public Client(String clientNumber, String name, String industry, String jurisdiction, boolean faceToFace, boolean pep, List<String> ownershipJurisdictions, List<String> pepJurisdictions, String clientType, User user) {
        this.clientNumber = clientNumber;
        this.name = name;
        this.industry = industry;
        this.jurisdiction = jurisdiction;
        this.faceToFace = faceToFace;
        this.pep = pep;
        this.ownershipJurisdictions = ownershipJurisdictions;
        this.pepJurisdictions = pepJurisdictions;
        this.clientType = clientType;
        this.user = user;
        this.matters = new ArrayList<>();
    }

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public boolean isFaceToFace() {
        return faceToFace;
    }

    public void setFaceToFace(boolean faceToFace) {
        this.faceToFace = faceToFace;
    }

    public boolean isPep() {
        return pep;
    }

    public void setPep(boolean pep) {
        this.pep = pep;
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

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Matter> getMatters() {
        return matters;
    }

    public void setMatters(List<Matter> matters) {
        this.matters = matters;
    }

    public void addOwnershipJurisdiction(String jurisdiction) {
        this.ownershipJurisdictions.add(jurisdiction);
    }
}

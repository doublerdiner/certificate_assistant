package com.codeclan.certificateassistant.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tcsps")
public class TCSP extends Matter{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    @Column(name = "incorporated_jurisdiction")
    private String incorporatedJurisdiction;
    @Column(name = "ownership_jurisdiction")
    private List<String> ownershipJurisdictions;

    public TCSP(String matterNumber, String name, Client client, double fees, LocalDate opened, String type, String incorporatedJurisdiction, List<String> ownershipJurisdictions) {
        super(matterNumber, name, client, fees, opened);
        this.type = type;
        this.incorporatedJurisdiction = incorporatedJurisdiction;
        this.ownershipJurisdictions = ownershipJurisdictions;
    }

    public TCSP() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
}

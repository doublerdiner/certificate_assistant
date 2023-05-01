package com.codeclan.certificateassistant.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "conveyances")
public class Conveyancing extends Matter{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price_paid")
    private double pricePaid;
    @Column(name = "private_funds")
    private double privateFunds;
    private boolean residential;

    public Conveyancing(String matterNumber, String name, Client client, double fees, LocalDate opened, double pricePaid, double privateFunds, boolean residential) {
        super(matterNumber, name, client, fees, opened);
        this.pricePaid = pricePaid;
        this.privateFunds = privateFunds;
        this.residential = residential;
    }

    public Conveyancing() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(double pricePaid) {
        this.pricePaid = pricePaid;
    }

    public double getPrivateFunds() {
        return privateFunds;
    }

    public void setPrivateFunds(double privateFunds) {
        this.privateFunds = privateFunds;
    }

    public boolean isResidential() {
        return residential;
    }

    public void setResidential(boolean residential) {
        this.residential = residential;
    }
}

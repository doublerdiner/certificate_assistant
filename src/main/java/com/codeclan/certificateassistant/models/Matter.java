package com.codeclan.certificateassistant.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "matters")
public abstract class Matter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "matter_number")
    private String matterNumber;
    private String name;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    @JsonIgnoreProperties({"matters"})
    private Client client;
    private double fees;
    private boolean aborted;
    private LocalDate opened;
    private LocalDate closed;

    public Matter(String matterNumber, String name, Client client, double fees, LocalDate opened) {
        this.matterNumber = matterNumber;
        this.name = name;
        this.client = client;
        this.fees = fees;
        this.aborted = false;
        this.opened = opened;
    }

    public Matter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatterNumber() {
        return matterNumber;
    }

    public void setMatterNumber(String matterNumber) {
        this.matterNumber = matterNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public boolean isAborted() {
        return aborted;
    }

    public void setAborted(boolean aborted) {
        this.aborted = aborted;
    }

    public LocalDate getOpened() {
        return opened;
    }

    public void setOpened(LocalDate opened) {
        this.opened = opened;
    }

    public LocalDate getClosed() {
        return closed;
    }

    public void setClosed(LocalDate closed) {
        this.closed = closed;
    }
}

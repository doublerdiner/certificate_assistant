package com.codeclan.certificateassistant.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
@Table(name = "clients")
public abstract class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "client_number")
    private String clientNumber;
    private String name;

    private String industry;

    @Column(name = "face_to_face")
    private boolean faceToFace;
    private boolean pep;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnoreProperties({"clients"})
    private User user;

    @JsonIgnoreProperties({"client"})
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<Matter> matters;

    public Client(String clientNumber, String name, String industry, boolean faceToFace, boolean pep, User user) {
        this.clientNumber = clientNumber;
        this.name = name;
        this.industry = industry;
        this.faceToFace = faceToFace;
        this.pep = pep;
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
}

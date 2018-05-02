package com.springboot.niall.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author - Niall Kelly
 */
@Entity
@Table(name="player")
public class PlayerEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String surname;

    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "team")
    private TeamEntity team;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public TeamEntity getTeam() {
        return team;
    }

    public void setTeam(TeamEntity team) {
        this.team = team;
    }
}

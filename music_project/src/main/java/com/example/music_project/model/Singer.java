package com.example.music_project.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_singer",columnDefinition = "varchar(45)")
    private String nameSinger;
    @Column(name = "nationality", columnDefinition = "varchar(45)")
    private String nationality;
    @Column(name = "date_of_birth",columnDefinition = "DATE")
    private LocalDate dateOfBirth;
    @Column(name = "gender", columnDefinition = "varchar(10)")
    private String gender;
    @Column(name = "image", columnDefinition = "varchar(255)")
    private String image;
    @Column(name = "describe_singer",columnDefinition = "MEDIUMTEXT")
    private String describeSinger;

    public Singer() {
    }

    public Singer(Integer id, String nameSinger, String nationality, LocalDate dateOfBirth, String gender, String image, String describeSinger) {
        this.id = id;
        this.nameSinger = nameSinger;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.image = image;
        this.describeSinger = describeSinger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescribeSinger() {
        return describeSinger;
    }

    public void setDescribeSinger(String describeSinger) {
        this.describeSinger = describeSinger;
    }
}

package com.example.music_project.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_author", columnDefinition = "varchar(45)")
    private String nameAuthor;
    @Column(name = "nationality",columnDefinition = "varchar(45)")
    private String nationality;
    @Column(name = "date_of_birth", columnDefinition = "date")
    private LocalDate dateOfBirth;
    @Column(name = "gender", columnDefinition = "varchar(10)")
    private String gender;
    @Column(name = "image", columnDefinition = "varchar(255)")
    private String image;
    @Column(name = "describe_author", columnDefinition = "mediumtext")
    private String describeAuthor;

    public Author() {
    }

    public Author(Integer id, String nameAuthor, String nationality, LocalDate dateOfBirth, String gender, String image, String describeAuthor) {
        this.id = id;
        this.nameAuthor = nameAuthor;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.image = image;
        this.describeAuthor = describeAuthor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
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

    public String getDescribeAuthor() {
        return describeAuthor;
    }

    public void setDescribeAuthor(String describeAuthor) {
        this.describeAuthor = describeAuthor;
    }
}

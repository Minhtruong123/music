package com.example.music_project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_album", columnDefinition = "varchar(45)")
    private String nameAlbum;
    @Column(name = "release_date", columnDefinition = "date")
    private LocalDate releaseDate;
    @Column(name = "image", columnDefinition = "varchar(255)")
    private String image;
    @Column(name = "describe_album", columnDefinition = "mediumtext")
    private String describeAlbum;
    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Song> songSet;

    public Album() {
    }

    public Album(Integer id, String nameAlbum, LocalDate releaseDate, String image, String describeAlbum, Set<Song> songSet) {
        this.id = id;
        this.nameAlbum = nameAlbum;
        this.releaseDate = releaseDate;
        this.image = image;
        this.describeAlbum = describeAlbum;
        this.songSet = songSet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescribeAlbum() {
        return describeAlbum;
    }

    public void setDescribeAlbum(String describeAlbum) {
        this.describeAlbum = describeAlbum;
    }

    public Set<Song> getSongSet() {
        return songSet;
    }

    public void setSongSet(Set<Song> songSet) {
        this.songSet = songSet;
    }
}

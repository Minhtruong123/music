package com.example.music_project.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_playlist",columnDefinition = "varchar(45)")
    private String namePlaylist;
    @Column(name = "release_date", columnDefinition = "date")
    private LocalDate releaseDate;
    @Column(name = "image",columnDefinition = "varchar(255)")
    private String image;
    @Column(name = "describe_playlist",columnDefinition = "mediumtext")
    private String describePlaylist;

    public Playlist() {
    }

    public Playlist(Integer id, String namePlaylist, LocalDate releaseDate, String image, String describePlaylist) {
        this.id = id;
        this.namePlaylist = namePlaylist;
        this.releaseDate = releaseDate;
        this.image = image;
        this.describePlaylist = describePlaylist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
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

    public String getDescribePlaylist() {
        return describePlaylist;
    }

    public void setDescribePlaylist(String describePlaylist) {
        this.describePlaylist = describePlaylist;
    }
}

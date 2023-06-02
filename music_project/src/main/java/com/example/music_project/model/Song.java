package com.example.music_project.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_song",columnDefinition = "varchar(45)")
    private String nameSong;
    @Column(name = "release_date",columnDefinition = "date")
    private LocalDate releaseDate;
    @Column(name = "image",columnDefinition = "varchar(255)")
    private String image;
    @Column(name = "length_song", columnDefinition = "varchar(10)")
    private String lengthSong;
    @ManyToOne
    @JoinColumn(name = "id_type_song",referencedColumnName = "id")
    @JsonManagedReference
    private TypeSong typeSong;
    @ManyToOne
    @JoinColumn(name = "id_album",referencedColumnName = "id")
    @JsonManagedReference
    private Album album;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "author_list",
            joinColumns = {@JoinColumn(name = "id_song",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id_author",referencedColumnName = "id")})
    private Set<Author> authorSet;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "singer_list",
            joinColumns = {@JoinColumn(name = "id_song",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id_singer",referencedColumnName = "id")})
    private Set<Singer> singerSet;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "playlist_detail",
            joinColumns = {@JoinColumn(name = "id_song",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id_playlist",referencedColumnName = "id")})
    private Set<Playlist> playlistSet;

    public Song() {
    }

    public Song(Integer id, String nameSong, LocalDate releaseDate, String image, String lengthSong, TypeSong typeSong, Set<Author> authorSet, Set<Singer> singerSet, Set<Playlist> playlistSet) {
        this.id = id;
        this.nameSong = nameSong;
        this.releaseDate = releaseDate;
        this.image = image;
        this.lengthSong = lengthSong;
        this.typeSong = typeSong;
        this.authorSet = authorSet;
        this.singerSet = singerSet;
        this.playlistSet = playlistSet;
    }

    public Song(Integer id, String nameSong, LocalDate releaseDate, String image, String lengthSong, TypeSong typeSong, Album album, Set<Author> authorSet, Set<Singer> singerSet, Set<Playlist> playlistSet) {
        this.id = id;
        this.nameSong = nameSong;
        this.releaseDate = releaseDate;
        this.image = image;
        this.lengthSong = lengthSong;
        this.typeSong = typeSong;
        this.album = album;
        this.authorSet = authorSet;
        this.singerSet = singerSet;
        this.playlistSet = playlistSet;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
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

    public String getLengthSong() {
        return lengthSong;
    }

    public void setLengthSong(String lengthSong) {
        this.lengthSong = lengthSong;
    }

    public TypeSong getTypeSong() {
        return typeSong;
    }

    public void setTypeSong(TypeSong typeSong) {
        this.typeSong = typeSong;
    }

    public Set<Author> getAuthorSet() {
        return authorSet;
    }

    public void setAuthorSet(Set<Author> authorSet) {
        this.authorSet = authorSet;
    }

    public Set<Singer> getSingerSet() {
        return singerSet;
    }

    public void setSingerSet(Set<Singer> singerSet) {
        this.singerSet = singerSet;
    }

    public Set<Playlist> getPlaylistSet() {
        return playlistSet;
    }

    public void setPlaylistSet(Set<Playlist> playlistSet) {
        this.playlistSet = playlistSet;
    }
}

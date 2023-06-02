package com.example.music_project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TypeSong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "type_name",columnDefinition = "varchar(45)")
    private String typeName;
    @OneToMany(mappedBy = "typeSong",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Song> songSet;
    public TypeSong() {
    }

    public TypeSong(Integer id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public TypeSong(Integer id, String typeName, Set<Song> songSet) {
        this.id = id;
        this.typeName = typeName;
        this.songSet = songSet;
    }

    public Set<Song> getSongSet() {
        return songSet;
    }

    public void setSongSet(Set<Song> songSet) {
        this.songSet = songSet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}

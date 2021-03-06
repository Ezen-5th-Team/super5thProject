package com.super5th.ezen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Movie {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String title;

    private String link;
    private String image;
    private String subtitle;
    private String pubDate;
    private String director;
    private String actor;
    private Double userRating;

    private LocalDate createDate;

    @PrePersist
    public void createDate(){
        this.createDate=LocalDate.now();
    }


}

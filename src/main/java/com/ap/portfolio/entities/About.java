package com.ap.portfolio.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class About extends Base {
    private String name;
    private String surname;
    private String title;
    private String location;
    private String about;
    private String urlPhoto;
    private String urlBanner;
    private String urlGit;
    private String urlLinkedin;
}

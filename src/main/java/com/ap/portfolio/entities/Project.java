package com.ap.portfolio.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project extends Base {
    private String name;
    private String description;
    private String link;
    private String urlGit;
    private String urlImg;
}

package com.ap.portfolio.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Experience extends Base {
    private String title;
    private String period;
    private String company;
    private String urlLogo;
    private String jobDescription;

}

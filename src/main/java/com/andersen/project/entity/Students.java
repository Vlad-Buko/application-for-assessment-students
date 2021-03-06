package com.andersen.project.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Author Vladislav Domaniewski 24_99 (c)
 * For company Andersen
 */

@Entity
@Data
@Table(name = "students")
@NoArgsConstructor
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "last")
    private String lastName;

    @Column
    private int score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_team")
    private Team team;
}

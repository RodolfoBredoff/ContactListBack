package br.pucminas.tecweb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Name {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnore
    @OneToOne(mappedBy = "name")
    private Contact contact;

    @Column
    @NotNull
    private String title;

    @Column
    @NotNull
    private String first;

    @NotNull
    @Column
    private String last;

}


package br.pucminas.tecweb.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Email
    @Column
    @NotNull
    private String email;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Name name;

    @Column
    @NotNull
    private String gender;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Registered registered;

    @Column
    @NotNull
    private String phone;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Picture picture;

    @Column
    @Size(max = 2)
    private String nat;

    @Column
    @NotNull
    private Boolean favorited;

}

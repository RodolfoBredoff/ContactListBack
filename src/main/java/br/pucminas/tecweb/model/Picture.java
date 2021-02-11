package br.pucminas.tecweb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Picture {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnore
    @OneToOne(mappedBy = "picture")
    private Contact contact;

    @Column
    @NotNull
    private String medium;

    @Column
    @NotNull
    private String large;

    @Column
    @NotNull
    private String thumbnail;

}

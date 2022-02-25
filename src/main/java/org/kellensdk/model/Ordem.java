package org.kellensdk.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Ordem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private Double preco;

    @Getter
    @Setter
    private String tipo;

    @Getter
    @Setter
    private LocalDate data;

    @Getter
    @Setter
    private String status;

    @Getter
    @Setter
    @Column(name = "user_id")
    private Long userId;
}
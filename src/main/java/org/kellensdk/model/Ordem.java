package org.kellensdk.model;

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
    @Setter
    private Double preco;
    @Setter
    private String tipo;
    @Setter
    private LocalDate data;
    @Setter
    private String status;
    @Setter
    @Column(name = "user_id")
    private Long userId;
}
package org.kellensdk.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Bitcoin {

    private Long id;

    private Double preço;

    private String tipo;

    private LocalDate data;

}
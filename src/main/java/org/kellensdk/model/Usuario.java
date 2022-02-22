package org.kellensdk.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String nome;
    @Setter
    private String cpf;
    @Setter
    private String username;
    @Setter
    private String password;
}
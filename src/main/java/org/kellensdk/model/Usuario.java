package org.kellensdk.model;

import io.quarkus.elytron.security.common.BcryptUtil;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;
import lombok.Getter;
import lombok.Setter;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@UserDefinition
public class Usuario extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    private String nome;

    @Setter
    private String cpf;

    @Username
    @Setter
    @Getter
    private String username;

    @Password
    @Setter
    @Getter
    @JsonbTransient
    private String password;

    @Roles
    @Setter
    @Getter
    private String role;

    public static void create(Usuario usuario) {
        usuario.password = BcryptUtil.bcryptHash(usuario.getPassword());
        usuario.role = validaUsername(usuario.getUsername());
        usuario.persist();
    }

    private static String validaUsername(String username) {
        if (username.equalsIgnoreCase("alura")) {
            return "admin";
        }
        return "user";
    }
}
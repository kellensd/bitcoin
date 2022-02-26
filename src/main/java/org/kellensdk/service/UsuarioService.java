package org.kellensdk.service;

import org.kellensdk.model.Usuario;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class UsuarioService {

    public void create(Usuario usuario) {
        Usuario.create(usuario);
    }

    public List<Usuario> listAllUsers() {
        return Usuario.listAll();
    }
}
package org.kellensdk.service;

import org.kellensdk.model.Ordem;
import org.kellensdk.model.Usuario;
import org.kellensdk.repository.OrdemRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.SecurityContext;
import java.time.LocalDate;
import java.util.Optional;

@ApplicationScoped
public class OrdemService {

    @Inject
    OrdemRepository ordemRepository;

    public void create(SecurityContext securityContext, Ordem ordem) {
        Optional<Usuario> userOptional = Usuario.findByIdOptional(ordem.getUserId());
        Usuario user = userOptional.orElseThrow(() -> new NotFoundException("Usuário não encontrado!"));

        if (!user.getUsername().equalsIgnoreCase(securityContext.getUserPrincipal().getName())) {
            throw new RuntimeException("O usuário logado é diferente do userId da operação solicitada.");
        }
        ordem.setData(LocalDate.now());
        ordem.setStatus("ENVIADA");
        ordemRepository.persist(ordem);
    }
}

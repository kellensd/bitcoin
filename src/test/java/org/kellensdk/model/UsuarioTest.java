package org.kellensdk.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.panache.mock.PanacheMock;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@QuarkusTest
class UsuarioTest {

    @Test
    void shouldReturnUserCorrectly() {
        PanacheMock.mock(Usuario.class);

        Usuario usuario = new Usuario();
        Optional<PanacheEntityBase> usuarios = Optional.of(usuario);

        when(Usuario.findByIdOptional(40)).thenReturn(usuarios);

        assertEquals(usuario, Usuario.findByIdOptional(40).get());
    }
}
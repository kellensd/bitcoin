package org.kellensdk.repository;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.Test;
import org.kellensdk.model.Ordem;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@QuarkusTest
class OrdemRepositoryTest {

    @InjectMock
    OrdemRepository ordemRepository;

    @Test
    public void shouldReturnOrdensWhenFindAll() {
        Ordem firstOrdem = new Ordem();
        Ordem secondOrdem = new Ordem();

        List<Ordem> ordens = new ArrayList<>();
        ordens.add(firstOrdem);
        ordens.add(secondOrdem);

        when(ordemRepository.listAll()).thenReturn(ordens);

        assertEquals(secondOrdem, ordemRepository.listAll().get(1));
    }
}
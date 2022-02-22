package org.kellensdk.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.kellensdk.model.Ordem;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrdemRepository implements PanacheRepository<Ordem> {
}

package org.kellensdk.resource;

import org.kellensdk.model.Ordem;
import org.kellensdk.service.OrdemService;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

@Path("/ordens")
public class OrdemResource {

    @Inject
    OrdemService ordemService;

    @POST
    @RolesAllowed("user")
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(@Context SecurityContext securityContext, Ordem ordem) {
        ordemService.create(securityContext, ordem);
    }
}
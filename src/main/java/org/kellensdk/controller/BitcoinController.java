package org.kellensdk.controller;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.kellensdk.model.Bitcoin;
import org.kellensdk.service.BitcoinService;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bitcoins")
public class BitcoinController {

    @Inject
    @RestClient
    BitcoinService bitcoinService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bitcoin> listar() {
        return bitcoinService.listar();
    }
}
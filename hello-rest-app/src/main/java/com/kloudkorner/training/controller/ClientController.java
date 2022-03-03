package com.kloudkorner.training.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kloudkorner.training.client.ClientService;
import com.kloudkorner.training.modal.Client;

@Component
@Path("/clients")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GET
	@Produces("application/json")
	public List<Client> getClients() {
		return new ArrayList<>(clientService.getClients());
	}
}

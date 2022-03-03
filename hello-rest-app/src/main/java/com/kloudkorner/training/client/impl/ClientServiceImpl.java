package com.kloudkorner.training.client.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kloudkorner.training.client.ClientService;
import com.kloudkorner.training.modal.Client;

@Service
public class ClientServiceImpl implements ClientService {

	@Override
	public List<Client> getClients() {

		final Client clientJohn = Client.newBuilder().firstName("John").lastName("Doe").build();
		final Client clientJane = Client.newBuilder().firstName("Jane").lastName("Doe").build();

		return Arrays.asList(clientJohn, clientJane);
	}
}

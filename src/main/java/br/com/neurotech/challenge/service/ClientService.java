package br.com.neurotech.challenge.service;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import br.com.neurotech.challenge.dto.ClientDto;
import br.com.neurotech.challenge.entity.NeurotechClient;
import br.com.neurotech.challenge.form.ClientForm;
import br.com.neurotech.challenge.repository.ClientRepository;

@Service
@RequiredArgsConstructor
public class ClientService {
	
	@Autowired
	ClientRepository clientRepository;	
	
	/**
	 * Salva um novo cliente
	 * 
	 * @return ID do cliente recém-salvo
	 */	
	public ClientDto save(ClientForm form) {
		NeurotechClient client = clientData(form);
		client = clientRepository.save(client);
		return clientDtoData(client);
	}
	
	/**
	 * Recupera um cliente baseado no seu ID
	 */	
	public ClientDto get(Long id) {
		Optional<NeurotechClient> optional = clientRepository.findById(id);
		if(optional.isPresent()) {
			return clientDtoData(optional.get());
		}
		return null;
	}
	
	private NeurotechClient clientData(ClientForm form) {
		NeurotechClient client = new NeurotechClient();
		client.setName(form.getName());
		client.setAge(form.getAge());
		client.setIncome(form.getIncome());
		return client;
	}
	
	private ClientDto clientDtoData(NeurotechClient client) {
		ClientDto dto = new ClientDto();
		dto.setId(client.getId());
		dto.setName(client.getName());
		dto.setAge(client.getAge());
		dto.setIncome(client.getIncome());
		return dto;
	}

}

package br.com.neurotech.challenge.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import br.com.neurotech.challenge.controller.NeurotechClientRepository;
import br.com.neurotech.challenge.entity.NeurotechClient;

@Service
@RequiredArgsConstructor
public class ClientService {
	
	private final NeurotechClientRepository neurotechClientRepository;
	
	/**
	 * Salva um novo cliente
	 * 
	 * @return ID do cliente recém-salvo
	 */
	String save(NeurotechClient client);
	
	/**
	 * Recupera um cliente baseado no seu ID
	 */
	NeurotechClient get(String id);

}

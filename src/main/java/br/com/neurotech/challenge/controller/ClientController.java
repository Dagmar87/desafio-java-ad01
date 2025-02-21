package br.com.neurotech.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.neurotech.challenge.dto.ClientDto;
import br.com.neurotech.challenge.form.ClientForm;
import br.com.neurotech.challenge.service.ClientService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
	public ClientDto save(@RequestBody @Valid ClientForm clientForm) {
		return clientService.save(clientForm);
	}
	
	@GetMapping("/{id}")
	public ClientDto get(@PathVariable("id") Long id) {
		return clientService.get(id);
	}

}

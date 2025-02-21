package br.com.neurotech.challenge.dto;

import br.com.neurotech.challenge.entity.NeurotechClient;
import lombok.Data;

@Data
public class ClientDto {
	
	private Long id;
	private String name;
	private Integer age;
	private Double income;
	
	public ClientDto() {
		
	}
	
	public ClientDto(NeurotechClient client) {
		this.id = client.getId();
		this.name = client.getName();
		this.age = client.getAge();
		this.income = client.getIncome();		
	}

}

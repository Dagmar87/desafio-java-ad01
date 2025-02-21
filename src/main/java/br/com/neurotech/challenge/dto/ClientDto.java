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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}	

}

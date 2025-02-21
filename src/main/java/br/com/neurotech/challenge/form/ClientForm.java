package br.com.neurotech.challenge.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ClientForm {
	
	@NotBlank(message = "Nome não pode estar em branco")
	private String name;
	@NotNull(message = "Idade não pode ser nula")
	private Integer age;
	@NotNull(message = "Renda não pode ser nula")
	private Double income;
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

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

}

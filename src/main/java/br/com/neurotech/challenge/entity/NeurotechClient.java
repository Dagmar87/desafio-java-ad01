package br.com.neurotech.challenge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NeurotechClient {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	private String name;
	private Integer age;
	private Double income;

}
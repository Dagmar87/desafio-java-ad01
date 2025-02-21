package br.com.neurotech.challenge.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name="clients")
public class NeurotechClient {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	@Column(name = "name", nullable = false)
    @Size(max = 120)
	private String name;
	@Column(name = "age", nullable = false)
	private Integer age;
	@Column(name = "income", nullable = false)
	private Double income;

}
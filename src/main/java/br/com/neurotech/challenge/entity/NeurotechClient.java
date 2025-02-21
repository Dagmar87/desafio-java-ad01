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
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
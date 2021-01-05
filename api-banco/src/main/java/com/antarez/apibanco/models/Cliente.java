package com.antarez.apibanco.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Cliente {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String email;
	private String cpf;
	private Date dataNascimento;

}

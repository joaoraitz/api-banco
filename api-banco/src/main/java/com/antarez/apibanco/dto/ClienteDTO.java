package com.antarez.apibanco.dto;

import javax.validation.constraints.NotBlank;

public class ClienteDTO {

	@NotBlank
	private String nome;
	
	@NotBlank
	private String email;

	@NotBlank
	private String cpf;
	
	@NotBlank
	private String dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}

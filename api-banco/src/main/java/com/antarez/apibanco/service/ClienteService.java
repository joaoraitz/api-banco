package com.antarez.apibanco.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.antarez.apibanco.dto.ClienteDTO;
import com.antarez.apibanco.models.Cliente;
import com.antarez.apibanco.repository.ClienteRepository;

@Component
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	private Cliente toCliente(ClienteDTO req) throws ParseException {
		Cliente cliente = new Cliente();
		cliente.setNome(req.getNome());
		cliente.setEmail(req.getEmail());
		cliente.setCpf(req.getCpf());
		String sDate1 = req.getDataNascimento();
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
		cliente.setDataNascimento(date1);
		return cliente;
	}

	public void saveCliente(ClienteDTO cliente) throws ParseException {
		clienteRepository.save(toCliente(cliente));
	}
}

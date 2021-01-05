package com.antarez.apibanco.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.antarez.apibanco.dto.ClienteDTO;
import com.antarez.apibanco.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/")
	public String cliente(ClienteDTO cliente) {
		return "cadastro";
	}

	@PostMapping("/cadastrar")
	public String cadastrar(@Valid ClienteDTO req, BindingResult result, Model model) throws ParseException {
		if (result.hasErrors()) {
			return "cadastro";
		}
		clienteService.saveCliente(req);
		System.out.println("Deu Certo! :)" + req.getNome() + " " + req.getEmail() + " " + req.getCpf() + " " + req.getDataNascimento());
		return "redirect:/home";
	}
}

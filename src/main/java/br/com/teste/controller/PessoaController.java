package br.com.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.model.Pessoa;
import br.com.teste.service.PessoaService;

@RestController
@RequestMapping("/teste")
public class PessoaController {
	
	@Autowired
	PessoaService pessoaService;
	
	@PostMapping ("/salvarPessoa")
	private Pessoa salvarPessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.salvarPessoa(pessoa);
		
	}
	@GetMapping ("/listarPessoaPorCpf")
	private Pessoa listaPessoa(@RequestParam Long cpf) {
		return pessoaService.listarPessoaPorCpf(cpf);
	}
	@GetMapping ("listarPessoa")
	private List<Pessoa> listarPessoa(@RequestParam String nome){
		return pessoaService.listarPessoa(nome);
	}
	
	

}

package br.com.teste.service;

import java.util.List;

import br.com.teste.model.Pessoa;

public interface PessoaService {
	
	Pessoa salvarPessoa(Pessoa pessoa);

	Pessoa listarPessoaPorCpf(Long cpf);

	List<Pessoa> listarPessoa(String nome);

	
}
package br.com.teste.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.model.Pessoa;
import br.com.teste.repository.PessoaRepository;
import br.com.teste.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	PessoaRepository PessoaRepository;
	
	@Override
	public Pessoa salvarPessoa(Pessoa pessoa) {
		return PessoaRepository.save(pessoa);
	}	
	
	@Override
	public Pessoa listarPessoaPorCpf(Long cpf) {
		return PessoaRepository.findByCPF(cpf);
	}
	@Override
	public List<Pessoa> listarPessoa(String nome) {
		return PessoaRepository.findByNome(nome);
	}

}

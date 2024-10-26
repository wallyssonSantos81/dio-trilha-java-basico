package com.example.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Cliente;
import com.example.model.ClienteRepository;
import com.example.model.Endereco;
import com.example.model.EnderecoRepository;
import com.example.service.ClienteService;
import com.example.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;
	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}
	@Override
public Cliente buscarPorId(Long id) {
    return clienteRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));
}
	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);
	}
	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if (clienteBd.isPresent()) {
			salvarClienteComCep(cliente);
		}
	}
	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);
	}
	private void salvarClienteComCep(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);
	}
}

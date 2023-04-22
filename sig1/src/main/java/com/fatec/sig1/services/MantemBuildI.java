package com.fatec.sig1.services;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fatec.sig1.model.Build;
import com.fatec.sig1.model.Repositorys.MantemBuildRepository;
import com.google.gwt.thirdparty.guava.common.base.Optional;

@Service

public class MantemBuildI {
	Logger logger = LogManager.getLogger(this.getClass());
	@Autowired
	MantemBuildRepository repository;

	public List<Build> consultaTodos() {
		logger.info(">>>>>> servico consultaTodos chamado");
		return repository.findAll();
	}

	/*
	 * @Override
	 * public void delete(Long id) {
	 * logger.info(">>>>>> servico delete por id chamado");
	 * repository.deleteById(id);
	 * }
	 * 
	 * @Override
	 * public Optional<Build> consultaPorNome(String nome) {
	 * logger.info(">>>>>> servico consultaPorNome chamado");
	 * return repository.findByNome(nome);
	 * }
	 * 
	 * @Override
	 * public Optional<Build> save(Build build) {
	 * logger.info(">>>>>> servico save chamado ");
	 * Build.setDataCadastro(new DateTime());
	 * Endereco endereco = obtemEndereco(cliente.getCep());
	 * cliente.setEndereco(endereco.getLogradouro());
	 * return Optional.ofNullable(repository.save(build))
	 * }
	 */

	/*
	 * 
	 * @Override
	 * public Optional<Build> atualiza(Long id, Build build) {
	 * logger.info(">>>>>> 1.servico atualiza informações de cliente chamado");
	 * Endereco endereco = obtemEndereco(cliente.getCep());
	 * Cliente clienteModificado = new Cliente(cliente.getNome(),
	 * cliente.getDataNascimento(), cliente.getSexo(),
	 * cliente.getCpf(), cliente.getCep(), cliente.getComplemento());
	 * clienteModificado.setId(id);
	 * clienteModificado.obtemDataAtual(new DateTime());
	 * clienteModificado.setEndereco(endereco.getLogradouro());
	 * 
	 * logger.
	 * info(">>>>>> 2. servico atualiza informacoes de cliente cep valido para o id => "
	 * + clienteModificado.getId());
	 * return Optional.ofNullable(repository.save(clienteModificado));
	 * }
	 * 
	 * 
	 * @Override
	 * public Optional<Build> save(Build build) {
	 * logger.info(">>>>>> servico save chamado ");
	 * Build.setDataCadastro(new DateTime())
	 * Endereco endereco = obtemEndereco(cliente.getCep());
	 * cliente.setEndereco(endereco.getLogradouro());
	 * return Optional.ofNullable(repository.save(build))
	 * }
	 */

}
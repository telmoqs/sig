package br.com.sig.neg.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.sig.dao.ClienteDao;
import br.com.sig.entidade.Cliente;
import br.com.sig.excessao.DadosInvalidosException;
import br.com.sig.neg.ClienteNeg;

@Service
public class ClienteNegImpl extends NegocioGenerico<Cliente> implements ClienteNeg {

	@Autowired
	public ClienteNegImpl(ClienteDao persistencia) {
		super(persistencia);
	}

	@Transactional
	public List<Cliente> listarPorCpfOuNome(String cpf, String nome) throws DadosInvalidosException {
		return ((ClienteDao) persistencia).listarPorCpfOuNome(cpf, nome);
	}

}

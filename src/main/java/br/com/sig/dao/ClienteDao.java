package br.com.sig.dao;

import java.util.List;

import br.com.sig.entidade.Cliente;
import br.com.sig.enumeradores.EnumTipoPessoa;
import br.com.sig.excessao.DadosInvalidosException;

public interface ClienteDao extends Persistencia<Cliente> {

	public List<Cliente> listarPorCpfOuNome(String cpf, String nome) throws DadosInvalidosException;

}

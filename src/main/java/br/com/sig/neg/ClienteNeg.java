package br.com.sig.neg;

import java.util.List;

import br.com.sig.entidade.Cliente;
import br.com.sig.enumeradores.EnumTipoPessoa;
import br.com.sig.excessao.DadosInvalidosException;

public interface ClienteNeg extends Negocio<Cliente> {

	public List<Cliente> listarPorCpfOuNome(String cpf, String nome) throws DadosInvalidosException;
}

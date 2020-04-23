package br.com.sig.neg;

import java.util.List;

import br.com.sig.excessao.DadosInvalidosException;

public interface Negocio<E> {

	void incluir(E entidade) throws DadosInvalidosException;

	void alterar(E entidade) throws DadosInvalidosException;

	void excluir(E entidade) throws DadosInvalidosException;

	List<E> listar() throws DadosInvalidosException;

}

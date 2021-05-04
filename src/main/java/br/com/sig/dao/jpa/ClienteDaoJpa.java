package br.com.sig.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import br.com.sig.dao.ClienteDao;
import br.com.sig.entidade.Cliente;
import br.com.sig.excessao.DadosInvalidosException;

@Repository
public class ClienteDaoJpa extends PersistenciaJpa<Cliente> implements ClienteDao {
	private static final long serialVersionUID = 4343505551216591569L;

	@PersistenceContext(unitName = "sig")
	@Qualifier(value = "managerEntityManagerFactory")
	private EntityManager em;

	public List<Cliente> listarPorCpfOuNome(String cpf, String nome) throws DadosInvalidosException {
		try {
			String jpaql = "select cliente from Cliente cliente where ";

			if (!cpf.equals("") && cpf.length() > 0) {
				jpaql += "cliente.pessoa.pessoaFisica.cpf = :cpf ";
			} else {
				jpaql += "cliente.pessoa.pessoaFisica.nome like :nome ";
			}

			Query query = em.createQuery(jpaql);

			if (!cpf.equals("") && cpf.length() > 0) {
				query.setParameter("cpf", cpf);
			} else {
				query.setParameter("nome", nome + "%");
			}

			return query.getResultList();
		} catch (Exception e) {
			throw new DadosInvalidosException(e.getMessage());
		}
	}

}

package br.com.sig.controle;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import br.com.sig.config.AppConfig;
import br.com.sig.entidade.Cliente;
import br.com.sig.excessao.DadosInvalidosException;
import br.com.sig.neg.ClienteNeg;

@Controller("ClienteControle")
public class ClienteControle extends SigControle implements Serializable {
	private static final long serialVersionUID = -7622599240385845530L;

	private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	private Cliente cliente;

	private String cpfConsulta;
	private String nomeConsulta;

	public ClienteControle() {
		this.novo();
	}

	@Override
	@PostConstruct
	public String novo() {
		cpfConsulta = "";
		nomeConsulta = "";
		return "sucesso";
	}

	public void listarClientes() throws DadosInvalidosException {
		try {
			if (!cpfConsulta.equals("") && cpfConsulta.length() > 0
					|| nomeConsulta.equals("") && nomeConsulta.length() > 0) {
				clientes = context.getBean(ClienteNeg.class).listarPorCpfOuNome(cpfConsulta, nomeConsulta);
			}
		} catch (Exception e) {
			addMensagemErro(e.getMessage());
		}
	}

	public void salvar() throws DadosInvalidosException {
		try {
			context.getBean(ClienteNeg.class).alterar(cliente);
			novo();
			addMensagemInfo(msgIncluidoSucesso);
		} catch (RuntimeException erro) {
			addMensagemErroFatal(erro);
		}
	}

	public void excluir(ActionEvent evento) throws DadosInvalidosException {
		try {
			cliente = (Cliente) evento.getComponent().getAttributes().get("registroSelecionado");
			context.getBean(ClienteNeg.class).excluir(cliente);
			addMensagemInfo(msgExcluidoSucesso);
		} catch (RuntimeException erro) {
			addMensagemErroFatal(erro);
		}
	}

	public void editar(ActionEvent evento) throws DadosInvalidosException {
		try {
			cliente = (Cliente) evento.getComponent().getAttributes().get("registroSelecionado");
		} catch (RuntimeException erro) {
			addMensagemErroFatal(erro);
		}
	}

	// getters and setters

	public String getCpfConsulta() {
		return cpfConsulta;
	}

	public void setCpfConsulta(String cpfConsulta) {
		this.cpfConsulta = cpfConsulta;
	}

	public String getNomeConsulta() {
		return nomeConsulta;
	}

	public void setNomeConsulta(String nomeConsulta) {
		this.nomeConsulta = nomeConsulta;
	}

}

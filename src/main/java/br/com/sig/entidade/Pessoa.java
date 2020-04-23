package br.com.sig.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.sig.enumeradores.EnumSimNao;
import br.com.sig.enumeradores.EnumTipoPessoa;

@Entity
public class Pessoa {

	@Id
	@Column(name = "pessoa_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pessoaId;

	@Enumerated(EnumType.STRING)
	private EnumSimNao permitirEnvioEmail = EnumSimNao.SIM;

	@Enumerated(EnumType.STRING)
	private EnumSimNao usuarioSistema = EnumSimNao.NAO;

	@Enumerated(EnumType.STRING)
	private EnumTipoPessoa tipoPessoa = EnumTipoPessoa.PF;

	@Column(length = 70)
	private String email;

	@Column(length = 60)
	private String senha;

	@Column(length = 60)
	private String login;

	@Column(name = "data_cadastro")
	@Temporal(TemporalType.DATE)
	private Date dataCadastro = new Date();

	@Temporal(TemporalType.DATE)
	private Date dataSenha;

	@Temporal(TemporalType.DATE)
	private Date dataUltimoAcesso;

	private String observacao;

	private Boolean cadastroAtivo = true;

	// getters and setters

	public EnumSimNao getPermitirEnvioEmail() {
		return permitirEnvioEmail;
	}

	public void setPermitirEnvioEmail(EnumSimNao permitirEnvioEmail) {
		this.permitirEnvioEmail = permitirEnvioEmail;
	}

	public EnumSimNao getUsuarioSistema() {
		return usuarioSistema;
	}

	public void setUsuarioSistema(EnumSimNao usuarioSistema) {
		this.usuarioSistema = usuarioSistema;
	}

	public EnumTipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(EnumTipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataSenha() {
		return dataSenha;
	}

	public void setDataSenha(Date dataSenha) {
		this.dataSenha = dataSenha;
	}

	public Date getDataUltimoAcesso() {
		return dataUltimoAcesso;
	}

	public void setDataUltimoAcesso(Date dataUltimoAcesso) {
		this.dataUltimoAcesso = dataUltimoAcesso;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Boolean getCadastroAtivo() {
		return cadastroAtivo;
	}

	public void setCadastroAtivo(Boolean cadastroAtivo) {
		this.cadastroAtivo = cadastroAtivo;
	}

	public Long getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(Long pessoaId) {
		this.pessoaId = pessoaId;
	}

	@Override
	public String toString() {
		return String.format("%scodigo=%d]", getClass().getSimpleName(), getPessoaId());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pessoaId == null) ? 0 : pessoaId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (pessoaId == null) {
			if (other.pessoaId != null)
				return false;
		} else if (!pessoaId.equals(other.pessoaId))
			return false;
		return true;
	}
}

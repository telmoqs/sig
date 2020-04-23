package br.com.sig.controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import br.com.sig.enumeradores.EnumEscolaridade;
import br.com.sig.enumeradores.EnumEstadoCivil;
import br.com.sig.enumeradores.EnumFatorRH;
import br.com.sig.enumeradores.EnumFormaPagamento;
import br.com.sig.enumeradores.EnumOrgaoRG;
import br.com.sig.enumeradores.EnumSexo;
import br.com.sig.enumeradores.EnumSimNao;
import br.com.sig.enumeradores.EnumTipoPessoa;
import br.com.sig.enumeradores.EnumTipoSanguineo;
import br.com.sig.enumeradores.EnumUf;

@Controller("ControleEnumerador")
public class ControleEnumerador implements Serializable {
	private static final long serialVersionUID = 644427377876725108L;

	public List<EnumEscolaridade> getListaEnumEscolaridade() {
		List<EnumEscolaridade> retorno = new ArrayList<EnumEscolaridade>();
		for (EnumEscolaridade enumerador : EnumEscolaridade.values()) {
			retorno.add(enumerador);
		}
		return retorno;
	}

	public List<EnumEstadoCivil> getListaEnumEstadoCivil() {
		List<EnumEstadoCivil> retorno = new ArrayList<EnumEstadoCivil>();
		for (EnumEstadoCivil enumerador : EnumEstadoCivil.values()) {
			retorno.add(enumerador);
		}
		return retorno;
	}

	public List<EnumSexo> getListaEnumSexo() {
		List<EnumSexo> retorno = new ArrayList<EnumSexo>();
		for (EnumSexo enumerador : EnumSexo.values()) {
			retorno.add(enumerador);
		}
		return retorno;
	}

	public List<EnumSimNao> getListaEnumSimNao() {
		List<EnumSimNao> retorno = new ArrayList<EnumSimNao>();
		for (EnumSimNao enumerador : EnumSimNao.values()) {
			retorno.add(enumerador);
		}
		return retorno;
	}

	public List<EnumTipoPessoa> getListaEnumTipoPessoa() {
		List<EnumTipoPessoa> retorno = new ArrayList<EnumTipoPessoa>();
		for (EnumTipoPessoa enumerador : EnumTipoPessoa.values()) {
			retorno.add(enumerador);
		}
		return retorno;
	}

	public List<EnumUf> getListaEnumUf() {
		List<EnumUf> retorno = new ArrayList<EnumUf>();
		for (EnumUf enumerador : EnumUf.values()) {
			retorno.add(enumerador);
		}
		return retorno;
	}

	public List<EnumOrgaoRG> getListaEnumOrgaoRG() {
		List<EnumOrgaoRG> retorno = new ArrayList<EnumOrgaoRG>();
		for (EnumOrgaoRG enumerador : EnumOrgaoRG.values()) {
			retorno.add(enumerador);
		}
		return retorno;
	}

	public List<EnumFatorRH> getListaEnumFatorRH() {
		List<EnumFatorRH> retorno = new ArrayList<EnumFatorRH>();
		for (EnumFatorRH enumerador : EnumFatorRH.values()) {
			retorno.add(enumerador);
		}
		return retorno;
	}

	public List<EnumTipoSanguineo> getListaEnumTipoSanguineo() {
		List<EnumTipoSanguineo> retorno = new ArrayList<EnumTipoSanguineo>();
		for (EnumTipoSanguineo enumerador : EnumTipoSanguineo.values()) {
			retorno.add(enumerador);
		}
		return retorno;
	}

	public List<EnumFormaPagamento> getListaEnumFormaPagamento() {
		List<EnumFormaPagamento> retorno = new ArrayList<EnumFormaPagamento>();
		for (EnumFormaPagamento enumerador : EnumFormaPagamento.values()) {
			retorno.add(enumerador);
		}
		return retorno;
	}

}

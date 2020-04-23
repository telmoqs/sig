package br.com.sig.util;

import java.text.SimpleDateFormat;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SigUtil {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public static HttpSession getSession() {
		return (HttpSession) SigUtil.getRequest().getSession(true);
	}

	public static HttpServletRequest getRequest() {
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext ec = context.getExternalContext();
		return (HttpServletRequest) ec.getRequest();
	}

	public static HttpServletResponse getResponse() {
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext ec = context.getExternalContext();
		return (HttpServletResponse) ec.getResponse();
	}

	public static String recuperaDiretorioRaiz() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		ServletContext ctx = (ServletContext) externalContext.getContext();
		return ctx.getRealPath("/");
	}

}

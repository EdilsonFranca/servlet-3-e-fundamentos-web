package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author EdilsonFranca (edilson18martins@hotmail.com)
 * 04/11/2018
 */
public class Logout implements Tarefa {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse response) {
		req.getSession().removeAttribute("usuarioLogado");
		return "/WEB-INF/paginas/logout.html";
	}

}

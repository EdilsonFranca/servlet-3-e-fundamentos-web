package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author EdilsonFranca (edilson18martins@hotmail.com)
 * 04/11/2018
 */
public interface Tarefa {

	String executa(HttpServletRequest req, HttpServletResponse response);

}

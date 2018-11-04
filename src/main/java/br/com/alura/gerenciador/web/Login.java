package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

/**
 * @author EdilsonFranca (edilson18martins@hotmail.com)
 * 04/11/2018
 */
public class Login implements Tarefa {
	

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse response) {
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);
		
		if(usuario==null) {
			return "/WEB-INF/paginas/errorDeLogin.jsp";		
		}else {
           HttpSession session =req.getSession();
           session.setAttribute("usuarioLogado", usuario);
           return "/WEB-INF/paginas/paginaPrincipal.jsp";
		}
	}
}

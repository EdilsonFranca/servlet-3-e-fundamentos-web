<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h3>Bem vindo ao nosso gerenciador de empresas!</h3>
	<br /> 

     <c:if test="${not empty usuarioLogado}">
          Logado com  ${usuarioLogado.email}<br/>
     </c:if>
	<form action="novaEmpresa" method="post">
		Nome:<input type="text" name="nome"> 
		     <input type="submit" value="Enviar">
	</form>

	<form action="executa" method="post">
		Email:<input type="email" name="email"> 
		Senha:<input type="password" name="senha"> 
		      <input type="hidden" name="tarefa" value="Login">
		      <input type="submit" value="Enviar">
	</form>
	<form action="executa" method="post">
	    <input type="hidden" name="tarefa" value="Logout">
		<input type="submit" value="deslogar">
	</form>
</body>
</html>
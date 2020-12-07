<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<%@ include file="head.jsp" %>


<body>
    <div class="bg-p">
    <%@ include file="botoes.jsp" %>
    
        <div id="titulo">
            <img src="img/titulos/T1.png" alt="">
        </div>
        <!-- <h1 class="h1-p">Personagens 1985 - Pós Viagem</h1> -->
		<h1 class="h1-p"><fmt:message key="site.titulo85Pos"/></h1>
        <div id="bd-personagens">
            <div id="bd-p">
                <div class="row">
                    <div class="column">
                    	<li><a href="ServletController?idPersonagem=2&&acao=personagem85Depois"> 
                        <img src="img/personagens/Marty.png" alt="Marty" style="width:100%">
                        </a></li>
                    </div>
                    <div class="column">
                    	<li><a href="ServletController?idPersonagem=5&&acao=personagem85Depois"> 
                        <img src="img/personagens/1985Pos/Alternate_Present_Biff.png" alt="Biff" style="width:100%" >
                        </a></li>
                    </div>
                    <div class="column">
                    	<li><a href="ServletController?idPersonagem=1&&acao=personagem85Depois"> 
                        <img src="img/personagens/1985Pos/Alternate_Present_Doc.png" alt="Emmett" style="width:100%" >
                        </a></li>
                    </div>
                    <div class="column">
                    	<li><a href="ServletController?idPersonagem=4&&acao=personagem85Depois"> 
                        <img src="img/personagens/1985Pos/Alternate_Present_George.png" alt="George" style="width:100%" >
                        </a></li>
                    </div>
                    <div class="column">
                    	<li><a href="ServletController?idPersonagem=3&&acao=personagem85Depois"> 
                        <img src="img/personagens/1985Pos/Alternate_Present_Lorraine.png" alt="Lorraine" style="width:100%" >
                        </a></li>
                    </div>
                    
                    <div id="info-personagens">
						<div class="info-geral" id="info-1">
							<h1>${Tnome}</h1>
							<p>${nome}</p>
						</div>
						<div class="info-geral" id="info-2">
							<h1>${TminiBio}</h1>
		            		<p>${miniBio}</p>
						</div>
						<div class="info-geral" id="info-3">
							<h1>${Tresumo1985Depois}</h1>
		            		<p>${resumo1985Depois}</p>
						</div>
						<div class="info-geral" id="info-4">
							<h1>${Tcuriosidades}</h1>
		            		<p>${curiosidades}</p>
						</div>
                	</div>
                </div>
        </div>
    </div>







    <script type="text/javascript" src="js/script.js"></script>
</body>

</html>
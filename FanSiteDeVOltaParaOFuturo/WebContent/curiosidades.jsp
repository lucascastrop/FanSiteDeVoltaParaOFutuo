<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<%@ include file="head.jsp" %>


<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
    <title>GlobalSolution</title>
</head>

<body>

    <div class="bg-p">
    <%@ include file="botoes.jsp" %>
    
        <div id="titulo">
            <img src="img/titulos/T5.png" alt="">
        </div>
			<h1 class="h1-link">Curiosidades</h1>
			<h1 class="h1-link"><fmt:message key="site.curiosidades"/></h1>
			
		<div class="container-curiosidade">
				
			<div id="img-curiosidades">
				<img alt="" src="img/easter/2.png">
				<img alt="" src="img/easter/3.png">
				<img alt="" src="img/easter/4.png">
				<img alt="" src="img/easter/5.png">
				<img alt="" src="img/easter/6.png">
				<img alt="" src="img/easter/7.png">
				<img alt="" src="img/easter/8.png">
			</div>
			
			<!-- 
			<div id="paragrafo">
	            <c:forEach items="${listaCuriosidades}" var="l">
	                  <p class="p-curi">${l.descricao}</p>  
	            </c:forEach>
			</div> -->
			
		</div>
		
		<div>
			<table>
            <thead>
                <tr>
                    <th>Curiosidades</th>
                </tr>
            </thead>
            <c:forEach items="${listaCuriosidades}" var="l">
                <tbody>
                    <tr>
                    	<td>${l.descricao}</td>  
                    </tr>
                </tbody>
            </c:forEach>
        </table>
			</div>
			
    </div>

    <script type="text/javascript" src="js/script.js"></script>
</body>

</html>
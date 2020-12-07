<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<%@ include file="head.jsp" %>

<body>
    <div class="bg">
    
    
        <div class="botoes">
            <button id="btn-1"> <a href="ServletController?acao=listarCuriosidadesGerais"> <img src="img/componentes/capacitor.png" alt=""> </a>
            </button>
            <button id="btn-2"><a href="timeline.jsp"> <img src="img/componentes/relogio.png" alt="">
                </a></button>
            <div class="btn-pten">
            	<button id="btn-3">PT</button>
            	<button id="btn-31">EN</button>
            </div>
			<!--<button id="btn-4"> <a href="links.jsp">Links Entregas</a></button>-->
            <button id="btn-4"> <a href="links.jsp"><fmt:message key="site.titulo"/></a></button>
            
        </div>

        <div class="logo">
            <img id="btf-logo" src="img/componentes/btf-logo.png" alt="">
        </div>

        <div class="animacao">
            <div class="moving" style="--i:1;">
                <img id="delorean" src="img/delorean/delorean2.png" alt="DeLorean">
            </div>
        </div>

    </div>
    <!-- 
    <footer>
        <div id="silueta-cidade">
            <p>Sigma™®© </p>
        </div>
    </footer> -->

    <script type="text/javascript" src="js/script.js"></script>
</body>

</html>
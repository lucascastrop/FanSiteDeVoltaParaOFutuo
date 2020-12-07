<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<%@ include file="head.jsp" %>
<body>

    <div class="bg-p">
    <%@ include file="botoes.jsp" %>
    
	<h1 class="h1-link"><fmt:message key="site.titulo"/></h1>
    <!-- <h1 class="h1-link">Links Entregaveis</h1> -->
        <ul class="lista-link">
            <li id="link-1"><a
                    href="https://drive.google.com/drive/folders/1Q6oNVjgQh_18jT5xT7h9DkkaKHGhQhBq?usp=sharing">MACHINE
                    LEARNING</a></li>
            <li id="link-2"><a
                    href="https://drive.google.com/drive/folders/1a42ct19M-iEEa0Tz5TEirM00HcaPBqnl?usp=sharing">DATABASE</a>
            </li>
            <li id="link-3"><a
                    href="https://drive.google.com/drive/folders/1-gMxc05MXCwwgt0g8cjwCMscLci3LCGV?usp=sharing">AGILE
                </a></li>
        </ul>


    </div>

    <script type="text/javascript" src="js/script.js"></script>
</body>

</html>
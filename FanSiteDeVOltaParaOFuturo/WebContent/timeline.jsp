<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>

<%@ include file="head.jsp" %>

<body>

    <div class="bg">
    <%@ include file="botoes.jsp" %>
    
        <div id="titulo">
            <img src="img/componentes/Display_1.png" alt="">
        </div>
        <div class="timeline">
            <div class="tooltip" id="time-1955">
                <h3><a href="personagens55.jsp">1955</a></h3>
                <span class="tooltiptext">Viagem para o passado</span>
            </div>
            <!-- <div id="time-dot"></div> -->
            <div class="tooltip" id="time-1985A">
                <h3><a href="personagens85.jsp">1985</a></h3>
                <span class="tooltiptext">Presente</span>
            </div>
            <!-- <div id="time-dot-2"></div> -->
            <div class="tooltip" id="time-1985D">
                <h3> <a href="personagens85Pos.jsp">1985</a> </h3>
                <span class="tooltiptext">Presente pos viagem</span>
            </div>

        </div>
    </div>

    <script type="text/javascript" src="js/script.js"></script>
</body>

</html>
<%--
  Created by IntelliJ IDEA.
  User: Fabia
  Date: 23.07.2019
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>--%>
<html>
<head>
    <title>Welcome</title>

</head>
<body>
<h1>Welcome :D</h1>

<div align="center">
    <form action="/searchCars" method="post">
        Marka : <input name="brand" type="text" value="" /><br>
        <br>
        Model : <input name="model" type="text" /><br>
        <br>
        Pojemność : <input name="engine" type="text" /><br>
        <br>
        Rocznik : <input name="year" type="text" /><br>
        <br>
        Moc : <input name="hp" type="text" /><br>
        <br>
        Przebieg : <input name="milleage" type="text" /><br>
        <br>
        Kolor : <input name="color" type="text" /><br>
        <br>
        Czy uszkodzony : <input name="damaged" type="text" /><br>
        <br>
        Skrzynia Biegów : <input name="automated" type="text" /><br>
        <br>
        Rodzaj Paliwa : <input name="fuel" type="text" /><br>
        <br>
        Kraj Pochodzenia : <input name="countryFrom" type="text" /><br>
        <br>
        Cena Od : <input name="priceFrom" type="text" /><br>
        <br>
        Cena Do : <input name="priceTo" type="text" /><br>
        <br>
        <input type="submit" value="Szukaj">


    </form>

</div>



<a href="${pageContext.request.contextPath}/carList">carList</a>


</body>
</html>

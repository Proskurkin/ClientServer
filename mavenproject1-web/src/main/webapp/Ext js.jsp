<%--
  Created by IntelliJ IDEA.
  User: eproskurin
  Date: 28.06.2016
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    .center {
        width: 200px; /* Ширина элемента в пикселах */
        padding: 40px; /* Поля вокруг текста */
        margin: auto; /* Выравниваем по центру */
        background: #fc0; /* Цвет фона */
    }
</style>
<meta charset="utf-8">
<body>
<div>
    <div style="text-align: center;">
        <h3>Diary</h3>
    </div>
    <form class="center">
        <div style="text-align: left;">
            <label for="fname">Login</label>
            <input type="text" id="fname" name="firstname">
            <br><br>
            <label for="lname">Password</label>
            <input type="text" id="lname" name="lastname">
        </div>
        <!--<div>-->
        <!--</div>-->
        <!--<label for="country">State</label>-->
        <!--<select id="country" name="country">-->
        <!--<div>-->
        <!--</div>-->
        <!--<option value="australia">Australia</option>-->
        <!--<option value="canada">Canada</option>-->
        <!--<option value="usa">USA</option>-->
        <!--</select>-->
        <!--<div>-->
        <!--</div>-->
        <br>
        <input type="submit" value="Войти">
        <div></div>
        <input type="submit" value="Регистрация">
    </form>
</div>
</body>
</html>

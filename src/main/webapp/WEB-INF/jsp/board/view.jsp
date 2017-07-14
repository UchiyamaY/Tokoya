<!-- 
 * @Class Name : home.jsp
 * @Description : 
 * @
 * @	修正日			修正者		修正内容
 * @ 	---------		---------		-------------------------------
 * @ 	2016.10.04		内山　佳美		最初作成
 * 
 * @author 李　多　浩
 * @since 2017.07.12
 * @version 0.1
 *
 *  Copyright (C) by NuriNubi All right reserved.
 * -->
<%@ page contentType="text/html; charset=UTF-8" language="java" errorPage=""%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page session="false" %>
<html>
<head>
	<title>Detail</title>
</head>
<body>
<div >
<h3>臨時休業のお知らせ</h3>
<ul>
    <c:forEach var="item" items="${result1}">
        <li>${item.noticeId} ${item.noticeTitle}</li>
    </c:forEach>
    </ul>
</div>
<hr/>
<div >お客様にはご迷惑をおかけしておりますことをお詫びいたします。</div>
<div align="right">2017/07/12</div>

<button type="submit" name="login">←</button>
<button type="submit" name="login">ホームに戻る</button>
<button type="submit" name="login">→</button>
    <ul>
    <c:forEach var="item" items="${result1}">
        <li>${item.noticeId} ${item.noticeTitle}</li>
    </c:forEach>
    </ul>
</body>

</html>
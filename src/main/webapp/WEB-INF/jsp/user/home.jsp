<!-- 
 * @Class Name : home.jsp
 * @Description : 
 * @
 * @	修正日			修正者		修正内容
 * @ 	---------		---------		-------------------------------
 * @ 	2016.10.04		李多浩		最初作成
 * 
 * @author 李　多　浩
 * @since 2017.07.12
 * @version 0.1
 *
 *  Copyright (C) by NuriNubi All right reserved.
 * -->
<%@ page contentType="text/html; charset=UTF-8" language="java"
	errorPage=""%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page session="false"%>

<html>

<head>
<title>Home</title>
</head>
<body>
	<form action="/login" method=GET>
		<div align="right">ようこそ ゲスト様</div>
		<div align="right">
			<button type="submit" id="homelogin">ログイン</button>
		</div>
		<h2>更新情報・お知らせ</h2>
		<hr />
		<div>
			<table style="border: 1px solid;">
				<tr>
					<th>No</th>
					<th>Title</th>
					<th>登録日</th>
				</tr>
				<tr>
					<td>1</td>
					<td><a href="/board/view">TITLE2</a></td>
					<td>2017/07/12</d>
				</tr>
			</table>
		</div>
	</form>
</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="homework.JankenBean"%>

<% 
JankenBean jankenBean = (JankenBean)session.getAttribute("jankenBean");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>じゃんけんの結果</title>
</head>
<body>
<h1>じゃんけんのこれまでの結果は以下です。</h1>
<ul>
<li><% for(JankenBean a:resultPast){ %>
    これまでの勝敗は<%= a %>です
<% } %></li>

</ul>

<a href="JankenServlet2">もう一回</a>
</body>

</html>
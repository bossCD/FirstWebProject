<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/16 0016
  Time: 上午 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>显示页面</title>
</head>
<body>
<div align="center">
    <h1>显示员工数据</h1>
    <table align="center" width="600px" height="400px" border="1px" cellspacing="0">
        <thead>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>工作</th>
            <th>上司编号</th>
            <th>入职时间</th>
            <th>工资</th>
            <th>奖金</th>
            <th>部门编号</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="emp" items="${emps}">
                <tr>
                    <td>${emp.empno}</td>
                    <td>${emp.ename}</td>
                    <td>${emp.job}</td>
                    <td>${emp.mgr}</td>
                    <td>${emp.hiredate}</td>
                    <td>${emp.sal}</td>
                    <td>${emp.comm}</td>
                    <td>${emp.deptno}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

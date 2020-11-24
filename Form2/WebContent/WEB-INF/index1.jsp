<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students</title>
</head>
<body>

<h2>Students List</h2>
<form>Create new student: <inputText></form>
<p><a href='<c:url value="/create" />'>Create new</a></p>
<table>
<tr><th>Name</th><th>AverScore</th><th></th></tr>
 <c:forEach items="${requestScope.list}" var="student">
                <tr>
                    <td><a href="${pageContext.request.contextPath}/GetStudent?id=${student.studentID}">${student.studentID}</a></td>
                    <td>${student.name}</td>
                    <td>${student.averscore}</td>
                </tr>
            </c:forEach> 

</table>
</body>
</html>
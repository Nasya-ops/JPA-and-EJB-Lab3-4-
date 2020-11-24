<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit student</title>
</head>
<body>
<h3>Edit student</h3>

  <form action="${pageContext.request.contextPath}/StudentServlet" method="POST">

<input type="hidden" value="${student.id}" name="id" />
<label>Name</label><br>
<input name="name" value="${student.name}" /><br><br>
<label>AverScore</label><br>
<input name="averScore" value="${student.averScore}" type="number" min="100" /><br><br>
<input type="submit" value="Send" />
</form>
</body>
</html>
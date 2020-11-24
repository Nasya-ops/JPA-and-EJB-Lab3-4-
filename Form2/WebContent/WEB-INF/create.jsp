<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create student</title>
</head>
<body>
<h3>New student</h3>

 <form action="${pageContext.request.contextPath}/StudentServlet" method="POST">
<label>Name</label><br>
<input name="name"/><br><br>
<label>AverScore</label><br>
<input name="averScore" type="number" min="100" /><br><br>
<input type="submit" value="Save" />
</form>
</body>
</html>
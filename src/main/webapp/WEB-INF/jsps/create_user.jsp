<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Registration</title>
</head>
<body>

		<h2>Create New User</h2>
		<form action="saveUsers" method="post">
			<pre>
				First Name<input type="text" name="firstName"/>
				Last Name<input type="text" name="lastName"/>
				User Name<input type="text" name="username"/>
				Email<input type="text" name="email"/>
				D.O.B<input type="date" name="dateOfBirth"/>
				<input type="submit" value="save"/>
			</pre>
		</form>

</body>
</html>
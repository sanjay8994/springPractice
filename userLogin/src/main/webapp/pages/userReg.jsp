<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/userRegistr" method="post">

<div class="container">
<div class="form-group">
<label>Username</label>
<input type="text" name="uname"  id ="uname"  class="form-control" ></input> </br>
</div>

<div class="form-group">
<label>Email</label>
<input type="text" name="email"  id ="email"  class="form-control" > </input> </br>
</div>

<div class="form-group">
    <button type="submit" class="btn btn-primary" >Sign Up!</button>
</div>
</div>

 </form>

</body>
</html>
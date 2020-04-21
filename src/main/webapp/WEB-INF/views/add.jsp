<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel ="stylesheet" href ="/MyStyle.css"/>
</head>
<body>

<h3>Add Quote</h3>

<label>New Quote</label>
<form action="/addQuote" method ="post"> 
<textarea name="quotation" placeholder="quotation" rows="10" cols="40" wrap="hard" required >  
</textarea> 
<p>
<input type="text" name="subject" placeholder="subject" required>
<input type="text" name="source" placeholder="source" required>


<select name="mood">

  <c:forEach items="${moods }" var="mood"> 
     <option>${mood}</option>
     
    </c:forEach>
  
</select>

<select name="time">
<option>N/A</option>
  <c:forEach items="${times }" var="time"> 
     <option>${time}</option>
     
    </c:forEach>
  
</select>
</p>
<p>
<button type="submit">Submit</button></p>
 </form>

</body>
</html>
<!-- Login.jsp -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<center>
<form:form  action="check.form" method="POST" commandName="u">
<table>
<tr>
<td>
Usename:</td><td><form:input path="uname"/>
</td> <td><font color='red'><form:errors path="uname"/></font></td>
</tr>
<tr>
<td>
Password:</td><td><form:password path="pwd"/></td><td><font color='red'><form:errors path="pwd"/></font></td>
</tr>
<tr>

<td>
<input type=submit value="submit">
</td>
<td></td>
</tr>
</table>
</form:form>
</center>

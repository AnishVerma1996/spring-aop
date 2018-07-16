<!-- register.jsp -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<spring:form action="registerUser.html" method="post" commandName="reg">
<table>
<tr>

<td>Usename</td><td><spring:input path="uname" /><spring:errors path="uname"/></td>
</tr>

<tr>
<td>Email</td><td><spring:input  path="email"/> <spring:errors path="email"/></td>
</tr>

<tr>
<td>Age</td><td><spring:input path="age"/> <spring:errors path="age"/></td>
</tr> 

<tr>
<td>Gender</td><td><spring:radiobutton path="gender" value="MALE" label="Male"/>

<spring:radiobutton path="gender" value="FEMALE" label="Femael"/>
<spring:errors path="gender"/> </td>
</tr>

<tr>


<td>Birth Day(MM/dd/yyyy)</td><td><spring:input path="birthDay"/><spring:errors path="birthDay"/></td>
</tr>
<tr>

<td>Country</td><td><spring:select path="country">
<spring:option value="">--select--</spring:option>
<spring:option value="INDIA">india</spring:option>
<spring:option value="CHAINA">chaina</spring:option>
<spring:option value="USA"> usa</spring:option>
</spring:select>

<spring:errors path="country"/></td>
</tr>
</table>
<input type="submit" value="submit">
</spring:form>
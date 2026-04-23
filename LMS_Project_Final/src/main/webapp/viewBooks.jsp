<%@ page import="java.util.*" %>

<html>
<head>
    <title>Books List</title>
</head>
<body>

<h2>Books List</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Author</th>
</tr>

<%
List<String[]> list = (List<String[]>) request.getAttribute("data");

if(list != null) {
    for(String[] row : list) {
%>
<tr>
    <td><%= row[0] %></td>
    <td><%= row[1] %></td>
    <td><%= row[2] %></td>
</tr>
<%
    }
} else {
%>
<tr><td colspan="3">No Data Found</td></tr>
<%
}
%>

</table>

</body>
</html>
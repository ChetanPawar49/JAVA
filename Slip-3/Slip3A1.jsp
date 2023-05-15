<!DOCTYPE html>
<html>
<head>
    <title>Patient Details</title>
</head>
<body>
    <h1>Patient Details</h1>
    <table>
        <thead>
            <tr>
                <th>PNo</th>
                <th>PName</th>
                <th>Address</th>
                <th>Age</th>
                <th>Disease</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><%= request.getParameter("PNo") %></td>
                <td><%= request.getParameter("PName") %></td>
                <td><%= request.getParameter("Address") %></td>
                <td><%= request.getParameter("Age") %></td>
                <td><%= request.getParameter("Disease") %></td>
            </tr>
        </tbody>
    </table>
</body>
</html>

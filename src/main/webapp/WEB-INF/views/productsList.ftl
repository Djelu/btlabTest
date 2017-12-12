<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Products</title>
    <link rel="stylesheet" href="/css/productsList.css">
</head>
<body>
<table >
    <tr>
        <th width="5%">Id</th>
        <th width="20%">Name</th>
        <th width="30%">Description</th>
        <th width="15%">Create date</th>
        <th width="15%">Place storage</th>
        <th width="5%">Reserved</th>
        <th width="10%" colspan="2">Actions</th>
    </tr>
<#list products as product>
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.description}</td>
        <td>${product.create_date}</td>
        <td>${product.place_storage}</td>
        <td>${product.reserved?string('yes','no')}</td>
        <td><a href="/update/${product.id}"><img src="/images/update.png" width="22" height="22"/></a></td>
        <td><a href="/delete/${product.id}"><img src="/images/delete.png" width="22" height="22"/></a></td>
    </tr>
</#list>
</table>
<a href="/addProduct"><img src="/images/create.png" width="44" height="44"/></a>
</body>
</html>
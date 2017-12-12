<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
    <link rel="stylesheet" href="../css/editProduct.css">
</head>
<body>

    <form class="form" id="userForm" name="user" action="/updateProduct" method="post">
        <p>Id</p>
        <input class="fild" title="Id" type="text" name="id" value="${product.id}" readonly>
        <p>Name</p>
        <input class="fild" title="Name" type="text" name="name" value="${product.name}">
        <p>Description</p>
        <textarea rows="4" cols="50" class="fild" title="Description" name="description">${product.description}</textarea>
        <p>Create date</p>
        <input class="fild" title="Create date" type="date" name="create_date" value="${product.create_date?string('yyyy-MM-dd')}">
        <p>Place storage</p>
        <input class="fild" title="Place storage" type="text" name="place_storage" value="${product.place_storage}" pattern="^\d+$">
        <span class="place_storage_error">В поле должно быть введено число.</span>
        <p>Reserved</p>
        <input class="checkbox" title="Reserved" type="checkbox" name="reserved" <#if product.reserved == true>checked value="TRUE"</#if>>
        <br/>
        <br/>
        <br/>
        <br/>
        <input class="button button1" type="submit" value="OK">
        <a href="/"><input class="button buttonCancel" type="button" value="Cancel"></a>
    </form>

</body>
</html>
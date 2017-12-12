<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create user page</title>
    <link rel="stylesheet" href="../css/createProduct.css">
</head>
<body>

<form class="form" name="user" action="/addProduct" method="post">
    <p>Name</p>
    <input class="fild" title="Name" type="text" name="name">
    <p>Description</p>
    <input class="fild" title="Description" type="text" name="description">
    <p>Create date</p>
    <input class="fild" title="Create date" type="date" name="create_date">
    <p>Place storage</p>
    <input class="fild" title="Place storage" type="text" name="place_storage" pattern="^\d+$">
    <span class="place_storage_error">В поле должно быть введено число.</span>
    <p>Reserved</p>
    <input class="checkbox" title="Reserved" type="checkbox" name="reserved">
    <br/>
    <br/>
    <br/>
    <input class="button buttonOk" type="submit" value="OK">
    <a href="/"><input class="button buttonCancel" type="button" value="Cancel"></a>
</form>

</body>
</html>
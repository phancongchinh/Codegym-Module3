<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
          crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="card">
        <div class="card-header">
            <h3>Product discount</h3>
        </div>
        <div class="card-body">
            <form action="${pageContext.request.contextPath}/product-discount" method="post">
                <div class="mb-3">
                    <label for="description" class="form-label">Product Description</label>
                    <input type="text" class="form-control" id="description" name="descripiton">
                </div>
                <div class="mb-3">
                    <label for="price" class="form-label">Product Price</label>
                    <input type="text" class="form-control" id="price" name="price">
                </div>
                <div class="mb-3">
                    <label for="discount" class="form-label">Product Discount</label>
                    <input type="text" class="form-control" id="discount" name="discount">
                </div>
                <button type="submit" class="btn btn-primary">Calculate</button>
            </form>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
        crossorigin="anonymous">

</script>
</body>
</html>
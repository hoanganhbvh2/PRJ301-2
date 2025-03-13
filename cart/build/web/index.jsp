<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách sản phẩm</title>
</head>
<body>
    <h2>Chọn sản phẩm để thêm vào giỏ hàng</h2>
    <form action="AddToCartServlet" method="post">
        <select name="product">
            <option value="Laptop - 1500$">Laptop - 1500$</option>
            <option value="Smartphone - 800$">Smartphone - 800$</option>
            <option value="Tablet - 500$">Tablet - 500$</option>
        </select>
        <input type="submit" value="Thêm vào giỏ hàng">
    </form>
    <br>
    <a href="view-cart">Xem giỏ hàng</a>
</body>
</html>

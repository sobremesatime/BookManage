<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Books</title>
</head>
<body>
<div>
    <h1>
        <small>书籍列表 —— 显示所有书籍</small>
    </h1>
</div>
<div>
    <div >
        <a href="http://localhost:8080/BookManage_war_exploded/static/html/addBook.html">新增书籍</a>
        <a href="http://localhost:8080/BookManage_war_exploded/book/allBook">显示全部书籍</a>
    </div>
    <br />
    <div>
        <form action="http://localhost:8080/BookManage_war_exploded/book/queryBook" method="get">
            <input type="text" name="bookname" placeholder="请输入书籍名称">
            <input type="submit" value="查询">
        </form>
        <br /><br />
    </div>
</div>
<div>
    <table>
        <thead>
        <tr>
            <th>书籍编号</th>
            <th>书籍名字</th>
            <th>书籍详情</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <#list list as list>
            <tr>
                <td>${list.book_id}</td>
                <td>${list.bookname}</td>
                <td>${list.detail}</td>
                <td>

                    <a href="http://localhost:8080/BookManage_war_exploded/book/toUpdateBook?book_id=${list.getBook_id()}">更改</a> |
                    <a href="http://localhost:8080/BookManage_war_exploded/book/del/${list.book_id}">删除</a>
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
<div>
    <a href="http://localhost:8080/BookManage_war_exploded/book/toAdminView">返回管理员界面</a>
</div>
</body>
</html>
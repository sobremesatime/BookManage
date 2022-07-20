<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Borrow</title>
</head>
<body>
<div>
    <h1>
        <small>用户借阅列表</small>
    </h1>
</div>
<div>
    <div >
        <a href="http://localhost:8080/BookManage_war_exploded/static/html/addBorrow.html">借阅</a>
    </div>
    <br />
    <div>
        <br /><br />
    </div>
</div>
<div>
    <table>
        <thead>
        <tr>
            <th>编号</th>
            <th>用户姓名</th>
            <th>书籍名称</th>
            <th>借阅状态</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <#list list as list>
            <tr>
                <td>${list.borrow_id}</td>
                <td>${list.username}</td>
                <td>${list.bookname}</td>
                <td>>${list.state}</td>
                <td>
                    <a href="http://localhost:8080/BookManage_war_exploded/borrow/del/${list.borrow_id}">归还</a>
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
<a href="http://localhost:8080/BookManage_war_exploded/book/toAdminView">返回管理员界面</a>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Users</title>
</head>
<body>
<div>
    <h1>
        <small>用户列表——所有用户</small>
    </h1>
</div>
<div>
    <div >
        <a href="http://localhost:8080/BookManage_war_exploded/static/html/addUser.html">新增用户</a>
        <a href="http://localhost:8080/BookManage_war_exploded/user/allUser">显示所有用户</a>
    </div>
    <br />
    <div>
        <form action="http://localhost:8080/BookManage_war_exploded/user/queryUserByName" method="get">
            <input type="text" name="username" placeholder="请输入用户名称">
            <input type="submit" value="查询">
        </form>
        <br /><br />
    </div>
</div>
<div>
    <table>
        <thead>
        <tr>
            <th>用户编号</th>
            <th>用户姓名</th>
            <th>用户密码</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <#list list as list>
            <tr>
                <td>${list.user_id}</td>
                <td>${list.username}</td>
                <td>${list.password}</td>
                <td>

                    <a href="http://localhost:8080/BookManage_war_exploded/user/toUpdateUser?user_id=${list.getUser_id()}">更改</a> |
                    <a href="http://localhost:8080/BookManage_war_exploded/user/del/${list.user_id}">删除</a>
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
<a href="http://localhost:8080/BookManage_war_exploded/book/toAdminView">返回管理员界面</a>
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Book</title>
</head>
<body>
<div>
    <div>
        <h1>
            <small>更新用户</small>
        </h1>
    </div>
    <form action="http://localhost:8080/BookManage_war_exploded/user/updateUser" method="get">
        <input type="hidden" name="user_id" value="${user.getUser_id()}"/>
        用户姓名：<input type="text" name="username" value="${user.getUsername()}"/><br><br><br>
        用户密码：<input type="password" name="password" value="${user.getPassword()}"/><br><br><br>
        <input type="submit" value="更新"/>
    </form>
</div>
</body>
</html>
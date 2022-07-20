<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin View</title>
</head>
<body>
<div>
  <p>管理员界面</p>
  <br />
  <p>欢迎${admin.adminname} 管理员使用该系统</p>
</div>
<div>
  <p><a href="http://localhost:8080/BookManage_war_exploded/book/allBook">图书管理</a></p>
  <br />
  <p><a href="http://localhost:8080/BookManage_war_exploded/borrow/allBorrow">借阅信息管理</a></p>
  <br />
  <p><a href="http://localhost:8080/BookManage_war_exploded/user/allUser">用户管理</a></p>
  <br />
</div>
<div>
  <p>管理员个人信息</p>
  <table>
    <thead>
    <tr>
      <th>编号</th>
      <th>姓名</th>
      <th>密码</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td>${admin.admin_id}</td>
      <td>${admin.adminname}</td>
      <td>${admin.password}</td>
    </tr>
    </tbody>
  </table>
</div>
</body>
</html>
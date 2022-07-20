<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User View</title>
</head>
<body>
  <div>
    <p>用户界面</p>
    <br />
    <p>欢迎${user.username} 用户使用该系统</p>
  </div>
  <div>
    <p><a href="">图书管理</a></p>
    <br />
    <p><a href="">借阅信息管理</a></p>
    <br />
  </div>
  <div>
    <p>用户个人信息</p>
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
        <td>${user.user_id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td><a href="">修改</a></td>
      </tr>
      </tbody>
    </table>
  </div>
</body>
</html>
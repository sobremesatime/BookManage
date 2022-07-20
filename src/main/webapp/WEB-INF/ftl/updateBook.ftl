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
      <small>更新书籍</small>
    </h1>
  </div>
  <form action="http://localhost:8080/BookManage_war_exploded/book/updateBook" method="get">
    <input type="hidden" name="book_id" value="${book.getBook_id()}"/>
    书籍名称：<input type="text" name="bookname" value="${book.getBookname()}"/><br><br><br>
    书籍详情：<input type="text" name="detail" value="${book.getDetail()}"/><br><br><br>
    <input type="submit" value="更新"/>
  </form>
</div>
</body>
</html>
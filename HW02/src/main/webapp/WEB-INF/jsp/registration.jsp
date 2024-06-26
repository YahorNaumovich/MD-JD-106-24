<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Регистрация</title>
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
  }
  h1 {
    color: #333;
    text-align: center;
  }
  form {
    width: 300px;
    margin: 0 auto;
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  }
  input[type="text"],
  input[type="password"] {
    width: 100%;
    padding: 10px;
    margin-top: 10px;
    margin-bottom: 20px;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-sizing: border-box;
  }
  button {
    display: block;
    width: 100%;
    padding: 10px;
    border: none;
    background-color: #007bff;
    color: #fff;
    border-radius: 5px;
    cursor: pointer;
  }
  button:hover {
    background-color: #0056b3;
  }
</style>
</head>
<body>
<h1>Регистрация нового пользователя</h1>
<form action="Controller" method="post">
<input type="hidden" name="command" value="main"/>
    <div>
      <input type="text" id="username" name="username" placeholder="Имя пользователя" required>
    </div>
    <div>
      <input type="text" id="email" name="email" placeholder="Email адрес" required>
    </div>
        <div>
      <input type="password" id="password" name="password" placeholder="Пароль" required>
    </div>
        <div>
      <input type="password" id="confirmPassword" name="confirmPassword" placeholder="Подтверждение пароля" required>
    </div>
    <div>
      <button type="submit">Зарегистрироваться</button>
    </div>
  </form>
</body>
</html>
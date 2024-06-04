<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판 글쓰기</title>
    <link rel="stylesheet" href="<c:url value='/resources/css/insert/insert.css'/>">
    <style>
        .preview-container {
            display: flex;
            flex-direction: column;
            gap: 20px;
            margin-top: 20px;
        }
        .preview-container img, .preview-container video {
            max-width: 100%;
            max-height: 300px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="header">
        <h1>게시판 글쓰기</h1>
    </div>

   <form action="<c:url value='/board/question'/>${questionBoard.id != null ? '/update' : ''}" method="post">
        <div class="form-group">
            <label for="title">제목:</label>
            <input type="text" id="title" name="title" value="${questionBoard.title}" required>
        </div>
        <div class="form-group">
            <label for="author">작성자:</label>
            <input type="text" id="author" name="author" value="${questionBoard.author}" required>
        </div>
        <div class="form-group">
            <label for="content">내용:</label>
             <textarea id="content" name="content" required>${questionBoard.content}</textarea>
        </div>
        <div class="form-group">
            <label for="image">사진:</label>
            <input type="file" id="image" name="image" accept="image/*">
        </div>
        <div class="form-group">
            <label for="video">동영상:</label>
            <input type="file" id="video" name="video" accept="video/*">
        </div>
        <div class="preview-container" id="preview-container">

        </div>
        <div class="form-actions">
            <button type="submit">등록</button>
            <button type="reset">초기화</button>
        </div>
    </form>
    <a href="<c:url value='/board/questions'/>">목록으로 돌아가기</a>
</div>
<script src="<c:url value='/resources/js/insert/insert.js'/>"></script>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>질문 수정</title>
</head>
<body>
    <h1>질문 수정</h1>
    <form action="<c:url value='/board/question/update'/>" method="post">
        <input type="hidden" name="id" value="${boardQuestion.boardQuestionId}">
        <label for="title">제목:</label>
        <input type="text" id="title" name="title" value="${boardQuestion.title}" required><br>
        <label for="content">내용:</label>
        <textarea id="content" name="content" required>${boardQuestion.content}</textarea><br>
        <label for="author">작성자:</label>
        <input type="text" id="author" name="author" value="${boardQuestion.userId}" required><br>
        <button type="submit">수정</button>
    </form>
    <a href="<c:url value='/board/questions'/>">목록으로 돌아가기</a>
</body>
</html>

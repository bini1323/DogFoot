<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>질문 삭제 확인</title>
</head>
<body>
    <h1>질문 삭제 확인</h1>
    <p>정말로 이 질문을 삭제하시겠습니까?</p>
    <form action="<c:url value='/board/question/delete/${questionId}'/>" method="post">
        <button type="submit">삭제</button>
        <a href="<c:url value='/board/questions'/>">취소</a>
    </form>
</body>
</html>

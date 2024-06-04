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



<script>
    $('#listButton').click(function() {
        $.ajax({
            type: 'GET',
            url: '/board/questions',
            success: function(response) {             
                window.location.href = '/board/questions';
            },
            error: function(xhr, status, error) {               
                console.error(error);
            }
        });
    });

   
    $('#writeButton').click(function() {
        $.ajax({
            type: 'GET',
            url: '/board/question/new',
            success: function(response) {               
                window.location.href = '/board/question/new';
            },
            error: function(xhr, status, error) {               
                console.error(error);
            }
        });
    });

    
    $('#editButton').click(function() {
        var questionId = ${question.boardQuestionId};
        $.ajax({
            type: 'GET',
            url: '/board/question/edit/' + questionId,
            success: function(response) {            
                window.location.href = '/board/question/edit/' + questionId;
            },
            error: function(xhr, status, error) {
                console.error(error);
            }
        });
    });


    $('#deleteButton').click(function() {
        var questionId = ${question.boardQuestionId};
        $.ajax({
            type: 'GET',
            url: '/board/question/delete/' + questionId,
            success: function(response) {
            },
            error: function(xhr, status, error) {
                console.error(error);
            }
        });
    });
</script>
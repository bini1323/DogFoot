<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="domain.question.vo.QuestionBoardVO" %>
<%@ page import="global.util.CommonUtils" %>
<%@ page import="java.util.List" %>

<%@ page import=" org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>

<% request.setCharacterEncoding("UTF-8");%> 
<% 
	Logger logger = LogManager.getLogger(this.getClass());
	logger.info("getAllQuestions");
	
	int pageSize = 0;
	int groupSize = 0;
	int curPage = 0;
	int totalCount = 0;
	
	Object objPaging = request.getAttribute("pagingqvo");
	QuestionBoardVO paggingQVO = (QuestionBoardVO)objPaging;
	
	Object obj = request.getAttribute("listAll");
	List<QuestionBoardVO> list = (List<QuestionBoardVO>)obj;
	
	int nCnt = list.size();
	String nCntS = "전체 조회 건수" + nCnt + "개";

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>

<script type="text/javascript">
	
	$(document).ready(function(){
		
		$(document).on("click", "#selectAllBtn", function(){
			if ($('.boardQuestionId"checked').length == 0){
				alret("글 번호 선택");
				return;
			}
			$("#")
		})
	})

</script>
</head>
<body>

</body>
</html>
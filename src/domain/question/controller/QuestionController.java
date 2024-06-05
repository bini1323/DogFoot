package domain.question.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import domain.question.service.QuestionService;
import domain.question.vo.QuestionBoardVO;
import global.util.CommonUtils;

@Controller
public class QuestionController {

   @Autowired(required=false)
   private QuestionService questionService;

   @GetMapping("getAllQuestions")
   public String getAllQuestions(QuestionBoardVO qvo, Model model) {
	  
	   List<QuestionBoardVO> listAll = questionService.getAllQuestions(qvo);
	   if(listAll.size() > 0) {
	   
	   model.addAttribute("listAll", listAll);
	  
		   
		   return "board_question/getAllQuestions";
	   }
	return "board_question/getAllQuestions";
   }
   
   @GetMapping("getQuestionById")
   public String getQuestionById(QuestionBoardVO qvo, Model model) {
	   
	   List<QuestionBoardVO> listS = questionService.getQuestionById(qvo);
	   if (listS.size() ==1) {
		   
		   int viewCnt = questionService.setViewCount(qvo);

		   model.addAttribute("listS", listS);
		  
		   return "board_question/getQuestionById";
	   }
	   return "board/getAllQuestions";
   }
   
   @GetMapping("updateQuestion")
   public String updateQuestion(QuestionBoardVO qvo, Model model) {
	   
	   int nCnt = questionService.updateQuestion(qvo);
	   
		if(nCnt > 0) {
		
			return "board_question/updateQuestion";
		}	   
	   return "#";
   }
   
   @GetMapping("deleteQuestion")
   public String deleteQuestion(QuestionBoardVO qvo, Model moderl) {
	   
	   int nCnt = questionService.deleteQuestion(qvo);
	   
	   if (nCnt > 0) {
		   
		   return "board_question/deleteQuestion";
	   }
	   return "#";
   }
}



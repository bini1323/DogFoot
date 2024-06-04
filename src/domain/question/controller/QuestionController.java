package domain.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import domain.question.service.QuestionService;
import domain.question.vo.QuestionBoardVO;



@Controller
@RequestMapping("/board")
public class QuestionController {


	    @Autowired(required=false)
	    private QuestionService questionService;

	    @GetMapping("/questions")
	    public String getAllBoardQuestions(Model model) {
	        List<QuestionBoardVO> questions = questionService.getAllQuestionBoardVO();
	        model.addAttribute("questions", questions);
	        return "board/list";
	    }

	    @GetMapping("/question/{id}")
	    public String getBoardQuestionById(@PathVariable String id, Model model) {
	        QuestionBoardVO question = questionService.getQuestionBoardById(id);
	        model.addAttribute("question", question);
	        return "board/detail";
	    }

	    @GetMapping("/question/new")
	    public String createQuestionBoardForm(Model model) {
	        model.addAttribute("questionBoard", new QuestionBoardVO());
	        return "board/form";
	    }

	    @PostMapping("/question")
	    public String createBoardQuestion(@ModelAttribute QuestionBoardVO questionBoardVO) {
	        questionService.insertQuestionBoardVO(questionBoardVO);
	        return "redirect:/board/questions";
	    }

	    @GetMapping("/question/edit/{id}")
	    public String editBoardQuestionForm(@PathVariable String id, Model model) {
	        QuestionBoardVO question = questionService.getQuestionBoardById(id);
	        model.addAttribute("boardQuestion", question);
	        return "board/form";
	    }

	    @PostMapping("/question/update")
	    public String updateBoardQuestion(@ModelAttribute QuestionBoardVO boardQuestion) {
	        questionService.updateQuestionBoard(boardQuestion);
	        return "redirect:/board/questions";
	    }

	    @GetMapping("/question/delete/{id}")
	    public String deleteBoardQuestion(@PathVariable String id) {
	        questionService.deleteQuestionBoard(id);
	        return "redirect:/board/questions";
	    }
}

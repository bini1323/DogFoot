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
import domain.question.vo.CommentQuestionVO;


@Controller
@RequestMapping("/board")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    
    @GetMapping("/question/new")
    public String createQuestionForm(Model model) {
        return "insert/insert"; 
    }

    @GetMapping("/questions")
    public String getAllBoardQuestions(Model model) {
        model.addAttribute("questions", questionService.getAllQuestionBoardVO());
        return "board_question";
    }    
        
    @GetMapping("/questions")
    public String getAllBoardQuestionslist(Model model) {
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

   
    @Autowired
    private CommentQuestionController commentQuestionController;

    @GetMapping("/comments")
    public String getAllComments(Model model) {
        return commentQuestionController.getAllComments(model);
    }

    @GetMapping("/comment/{id}")
    public String getCommentById(@PathVariable String id, Model model) {
        return commentQuestionController.getCommentById(id, model);
    }

    @GetMapping("/comment/new")
    public String createCommentForm(Model model) {
        return commentQuestionController.createCommentForm(model);
    }

    @PostMapping("/comment")
    public String createComment(@ModelAttribute CommentQuestionVO comment) {
        return commentQuestionController.createComment(comment);
    }

    @GetMapping("/comment/edit/{id}")
    public String editCommentForm(@PathVariable String id, Model model) {
        return commentQuestionController.editCommentForm(id, model);
    }

    @PostMapping("/comment/update")
    public String updateComment(@ModelAttribute CommentQuestionVO comment) {
        return commentQuestionController.updateComment(comment);
    }

    @GetMapping("/comment/delete/{id}")
    public String deleteComment(@PathVariable String id) {
        return commentQuestionController.deleteComment(id);
    }
}

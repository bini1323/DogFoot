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
import domain.question.vo.CommentQuestionVO;
import domain.question.service.CommentQuestionService;

@Controller
@RequestMapping("/comment")
public class CommentQuestionController {

	@Autowired
    private CommentQuestionService CommentQuestionService;

    @GetMapping("/comments")
    public String getAllComments(Model model) {
        List<CommentQuestionVO> comments = CommentQuestionService.getAllComments();
        model.addAttribute("comments", comments);
        return "comment/list";
    }

    @GetMapping("/comment/{id}")
    public String getCommentById(@PathVariable String id, Model model) {
        CommentQuestionVO comment = CommentQuestionService.getCommentById(id);
        model.addAttribute("comment", comment);
        return "comment/detail";
    }

    @GetMapping("/comment/new")
    public String createCommentForm(Model model) {
        model.addAttribute("comment", new CommentQuestionVO());
        return "comment/form";
    }

    @PostMapping("/comment")
    public String createComment(@ModelAttribute CommentQuestionVO comment) {
    	CommentQuestionService.insertComment(comment);
        return "redirect:/board/comments";
    }

    @GetMapping("/comment/edit/{id}")
    public String editCommentForm(@PathVariable String id, Model model) {
        CommentQuestionVO comment = CommentQuestionService.getCommentById(id);
        model.addAttribute("comment", comment);
        return "comment/form";
    }

    @PostMapping("/comment/update")
    public String updateComment(@ModelAttribute CommentQuestionVO comment) {
    	CommentQuestionService.updateComment(comment);
        return "redirect:/board/comments";
    }

    @GetMapping("/comment/delete/{id}")
    public String deleteComment(@PathVariable String id) {
    	CommentQuestionService.deleteComment(id);
        return "redirect:/board/comments";
    }
}


    
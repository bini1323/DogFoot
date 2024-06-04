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


@Controller
@RequestMapping("/board")
public class CommentQuestionController {

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

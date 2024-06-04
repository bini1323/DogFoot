package domain.question.service;

import java.util.List;
import domain.question.vo.CommentQuestionVO;

public interface CommentQuestionService {
    List<CommentQuestionVO> getAllComments();
    CommentQuestionVO getCommentById(String id);
    void insertComment(CommentQuestionVO comment);
    void updateComment(CommentQuestionVO comment);
    void deleteComment(String id);
}

package domain.question.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.question.dao.CommentQuestionDAO;
import domain.question.vo.CommentQuestionVO;

@Service
public class CommentQuestionServiceImpl implements CommentQuestionService {

    @Autowired
    private CommentQuestionDAO commentQuestionDAO;

    @Override
    public List<CommentQuestionVO> getAllComments() {
        return commentQuestionDAO.getAllComments();
    }

    @Override
    public CommentQuestionVO getCommentById(String id) {
        return commentQuestionDAO.getCommentById(id);
    }

    @Override
    public void insertComment(CommentQuestionVO comment) {
        commentQuestionDAO.insertComment(comment);
    }

    @Override
    public void updateComment(CommentQuestionVO comment) {
        commentQuestionDAO.updateComment(comment);
    }

    @Override
    public void deleteComment(String id) {
        commentQuestionDAO.deleteComment(id);
    }
}

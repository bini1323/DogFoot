package domain.question.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import domain.question.vo.CommentQuestionVO;
import global.mybatis.query.CommentQuestionMapper;

@Repository
public class CommentQuestionDAOImpl implements CommentQuestionDAO {

    @Autowired
    private CommentQuestionMapper commentQuestionMapper;

    @Override
    public List<CommentQuestionVO> getAllComments() {
        return commentQuestionMapper.getAllComments();
    }

    @Override
    public CommentQuestionVO getCommentById(String id) {
        return commentQuestionMapper.getCommentById(id);
    }

    @Override
    public void insertComment(CommentQuestionVO comment) {
        commentQuestionMapper.insertComment(comment);
    }

    @Override
    public void updateComment(CommentQuestionVO comment) {
        commentQuestionMapper.updateComment(comment);
    }

    @Override
    public void deleteComment(String id) {
        commentQuestionMapper.deleteComment(id);
    }
}

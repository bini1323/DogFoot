package domain.question.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import domain.question.vo.CommentQuestionVO;
import query.CommentQuestionMapper;

@Repository
public class CommentQuestionDAOImpl implements CommentQuestionDAO {

	@Override
	public List<CommentQuestionVO> getAllComments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommentQuestionVO getCommentById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertComment(CommentQuestionVO comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateComment(CommentQuestionVO comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComment(String id) {
		// TODO Auto-generated method stub
		
	}

    /*@Autowired(required=false)
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
    }*/
}

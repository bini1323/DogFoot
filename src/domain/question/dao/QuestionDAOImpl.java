package domain.question.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import domain.question.vo.QuestionBoardVO;
import query.QuestionMapper;

@Repository
public class QuestionDAOImpl implements QuestionDAO {

	@Override
	public List<QuestionBoardVO> getAllQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuestionBoardVO getQuestionById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertQuestion(QuestionBoardVO question) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateQuestion(QuestionBoardVO question) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteQuestion(String id) {
		// TODO Auto-generated method stub
		
	}

    /*@Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<QuestionBoardVO> getAllQuestions() {
        return questionMapper.getAllQuestions();
    }

    @Override
    public QuestionBoardVO getQuestionById(String id) {
        return questionMapper.getQuestionById(id);
    }

    @Override
    public void insertQuestion(QuestionBoardVO question) {
        questionMapper.insertQuestion(question);
    }

    @Override
    public void updateQuestion(QuestionBoardVO question) {
        questionMapper.updateQuestion(question);
    }

    @Override
    public void deleteQuestion(String id) {
        questionMapper.deleteQuestion(id);
    }*/
}

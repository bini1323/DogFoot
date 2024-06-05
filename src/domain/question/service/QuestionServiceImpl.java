package domain.question.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import domain.question.dao.QuestionDAO;
import domain.question.vo.QuestionBoardVO;




@Service
@Repository
public class QuestionServiceImpl implements QuestionService {

    @Autowired(required=false)
    private QuestionDAO questionDAO;

    @Override
    public List<QuestionBoardVO> getAllQuestions(QuestionBoardVO qvo) {
        return questionDAO.getAllQuestions(qvo);
    }

    @Override
    public List<QuestionBoardVO> getQuestionById(QuestionBoardVO qvo) {
        return questionDAO.getQuestionById(qvo);
    }

    @Override
    public int insertQuestion(QuestionBoardVO qvo) {
        return questionDAO.insertQuestion(qvo);
    }

    @Override
    public int updateQuestion(QuestionBoardVO qvo) {
        return questionDAO.updateQuestion(qvo);
    }

    @Override
    public int deleteQuestion(QuestionBoardVO qvo) {
        return questionDAO.deleteQuestion(qvo);
    }

    @Override
    public int setViewCount(QuestionBoardVO qvo) {
    	return questionDAO.setViewCount(qvo);
    }
}
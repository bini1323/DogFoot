package domain.question.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.question.dao.QuestionDAO;
import domain.question.vo.QuestionBoardVO;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDAO questionDAO;

    @Override
    public List<QuestionBoardVO> getAllQuestionBoardVO() {
        return questionDAO.getAllQuestions();
    }

    @Override
    public QuestionBoardVO getQuestionBoardById(String id) {
        return questionDAO.getQuestionById(id);
    }

    @Override
    public void insertQuestionBoardVO(QuestionBoardVO boardQuestion) {
        questionDAO.insertQuestion(boardQuestion);
    }

    @Override
    public void updateQuestionBoard(QuestionBoardVO boardQuestion) {
        questionDAO.updateQuestion(boardQuestion);
    }

    @Override
    public void deleteQuestionBoard(String id) {
        questionDAO.deleteQuestion(id);
    }
}

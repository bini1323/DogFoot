package domain.question.dao;

import java.util.List;
import domain.question.vo.QuestionBoardVO;

public interface QuestionDAO {
    List<QuestionBoardVO> getAllQuestions();
    QuestionBoardVO getQuestionById(String id);
    void insertQuestion(QuestionBoardVO question);
    void updateQuestion(QuestionBoardVO question);
    void deleteQuestion(String id);
}

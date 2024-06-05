package domain.question.dao;

import java.util.List;
import domain.question.vo.QuestionBoardVO;

public interface QuestionDAO {

	List<QuestionBoardVO> getAllQuestions(QuestionBoardVO qvo);

	List<QuestionBoardVO> getQuestionById(QuestionBoardVO qvo);

	int insertQuestion(QuestionBoardVO qvo);

	int updateQuestion(QuestionBoardVO qvo);

	int deleteQuestion(QuestionBoardVO qvo);

	int setViewCount(QuestionBoardVO qvo);
	

}

package domain.question.service;

import java.util.List;
import domain.question.vo.QuestionBoardVO;

public interface QuestionService {

    List<QuestionBoardVO> getAllQuestionBoardVO();

    QuestionBoardVO getQuestionBoardById(String id);

    void insertQuestionBoardVO(QuestionBoardVO boardQuestion);

    void updateQuestionBoard(QuestionBoardVO boardQuestion);

    void deleteQuestionBoard(String id);
}
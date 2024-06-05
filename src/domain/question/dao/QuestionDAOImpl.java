package domain.question.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import domain.question.vo.QuestionBoardVO;


@Repository
public class QuestionDAOImpl implements QuestionDAO {
	

	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<QuestionBoardVO> getAllQuestions(QuestionBoardVO qvo) {
		
		return sqlSession.selectList("getAllQuestions", qvo);
	}

	@Override
	public List<QuestionBoardVO> getQuestionById(QuestionBoardVO qvo) {
		
		return sqlSession.selectList("getQuestionById", qvo);
	}

	@Override
	public int insertQuestion(QuestionBoardVO qvo) {
		
		return sqlSession.insert("insertQuestion", qvo);
	}

	@Override
	public int updateQuestion(QuestionBoardVO qvo) {
		
		return sqlSession.update("updateQuestion", qvo);
	}

	@Override
	public int deleteQuestion(QuestionBoardVO qvo) {
		
		return sqlSession.update("deleteQuestion", qvo);
	}

	@Override
	public int setViewCount(QuestionBoardVO qvo) {
		
		return sqlSession.update("setViewCount", qvo);
	}

}

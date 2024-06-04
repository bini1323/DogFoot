package query;

import java.util.List;
import domain.question.vo.QuestionBoardVO;
import org.apache.ibatis.annotations.*;


public interface QuestionMapper {

    @Select("SELECT * FROM question_board")
    List<QuestionBoardVO> getAllQuestions();

    @Select("SELECT * FROM question_board WHERE boardQuestionId = #{id}")
    QuestionBoardVO getQuestionById(String id);

    @Insert("INSERT INTO question_board (boardQuestionId, title, content, viewCount, pictureFile, userId, deleteyn, createDate, modifiedDate) " +
            "VALUES (#{boardQuestionId}, #{title}, #{content}, #{viewCount}, #{pictureFile}, #{userId}, #{deleteyn}, #{createDate}, #{modifieDate})")
    void insertQuestion(QuestionBoardVO question);

    @Update("UPDATE question_board SET title = #{title}, content = #{content}, viewCount = #{viewCount}, pictureFile = #{pictureFile}, userId = #{userId}, deleteyn = #{deleteyn}, createDate = #{createDate}, modifiedDate = #{modifieDate} WHERE boardQuestionId = #{boardQuestionId}")
    void updateQuestion(QuestionBoardVO question);

    @Delete("DELETE FROM question_board WHERE boardQuestionId = #{id}")
    void deleteQuestion(String id);
}

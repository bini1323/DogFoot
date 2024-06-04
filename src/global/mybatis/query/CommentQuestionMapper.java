package global.mybatis.query;

import java.util.List;
import domain.question.vo.CommentQuestionVO;
import org.apache.ibatis.annotations.*;

public interface CommentQuestionMapper {

    @Select("SELECT * FROM COMMENTQUESTION")
    List<CommentQuestionVO> getAllComments();

    @Select("SELECT * FROM COMMENTQUESTION WHERE COMMENTQUESTIONID = #{id}")
    CommentQuestionVO getCommentById(String id);

    @Insert("INSERT INTO COMMENTQUESTION (COMMENTQUESTIONID, CONTENT, USERID, BOARDQUESTIONID, DELETEYN, CREATEDDATE, MODIFIEDDATE) " +
            "VALUES (#{commentQuestionId}, #{content}, #{userId}, #{boardQuestionId}, #{deleteyn}, #{createdDate}, #{modifiedDate})")
    void insertComment(CommentQuestionVO comment);

    @Update("UPDATE COMMENTQUESTION SET CONTENT = #{content}, USERID = #{userId}, BOARDQUESTIONID = #{boardQuestionId}, DELETEYN = #{deleteyn}, CREATEDDATE = #{createdDate}, MODIFIEDDATE = #{modifiedDate} WHERE COMMENTQUESTIONID = #{commentQuestionId}")
    void updateComment(CommentQuestionVO comment);

    @Delete("DELETE FROM COMMENTQUESTION WHERE COMMENTQUESTIONID = #{id}")
    void deleteComment(String id);
}

package domain.question.vo;

import java.util.Date;

public class CommentQuestionVO {
    private String commentQuestionId;
    private String content;
    private String userId;
    private String boardQuestionId;
    private String deleteyn;
    private Date createdDate;
    private Date modifiedDate;

    // Getters and Setters
    public String getCommentQuestionId() {
        return commentQuestionId;
    }

    public void setCommentQuestionId(String commentQuestionId) {
        this.commentQuestionId = commentQuestionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBoardQuestionId() {
        return boardQuestionId;
    }

    public void setBoardQuestionId(String boardQuestionId) {
        this.boardQuestionId = boardQuestionId;
    }

    public String getDeleteyn() {
        return deleteyn;
    }

    public void setDeleteyn(String deleteyn) {
        this.deleteyn = deleteyn;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}

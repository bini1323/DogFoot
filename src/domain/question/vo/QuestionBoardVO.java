package domain.question.vo;

import java.time.LocalDateTime;

public class QuestionBoardVO {

    private String boardQuestionId;
    private String title;
    private String content;
    private int viewCount;
    private String pictureFile;
    private String userId;
    private String deleteyn;
    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;

    // Getter and Setter for boardQuestionId
    public String getBoardQuestionId() {
        return boardQuestionId;
    }

    public void setBoardQuestionId(String boardQuestionId) {
        this.boardQuestionId = boardQuestionId;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Getter and Setter for viewCount
    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    // Getter and Setter for pictureFile
    public String getPictureFile() {
        return pictureFile;
    }

    public void setPictureFile(String pictureFile) {
        this.pictureFile = pictureFile;
    }

    // Getter and Setter for userId
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    // Getter and Setter for deleteyn
    public String getDeleteyn() {
        return deleteyn;
    }

    public void setDeleteyn(String deleteyn) {
        this.deleteyn = deleteyn;
    }

    // Getter and Setter for createDate
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    // Getter and Setter for modifiedDate
    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
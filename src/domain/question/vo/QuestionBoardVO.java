package domain.question.vo;

public class QuestionBoardVO {

    private String boardQuestionId;
    private String title;
    private String content;
    private int viewCount;
    private String pictureFile;
    private String userId;
    private boolean deleteyn;
    private String createDate;
    private String modifiedDate;

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
    public boolean getDeleteyn() {
        return deleteyn;
    }

    public void setDeleteyn(boolean deleteyn) {
        this.deleteyn = deleteyn;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
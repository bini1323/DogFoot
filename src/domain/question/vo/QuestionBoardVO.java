package domain.question.vo;

public class QuestionBoardVO {

	private String boardQuestionId;
	private String title;
	private String content;
	private int viewCount;
	private String pictureFile;
	private String userId;
	private String deleteyn;
	private String createDate;
	private String modifieDate;
	
	
	
	
	
	
	
	
	public String getBoardQuestionId() {
		return boardQuestionId;
	}
	public void setBoardQuestionId(String boardQuestionId) {
		this.boardQuestionId = boardQuestionId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getPictureFile() {
		return pictureFile;
	}
	public void setPictureFile(String pictureFile) {
		this.pictureFile = pictureFile;
	}
	public String getUserId() {
		return userId;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDeleteyn() {
		return deleteyn;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getModifieDate() {
		return modifieDate;
	}
	public void setModifieDate(String modifieDate) {
		this.modifieDate = modifieDate;
	}
	
	
}

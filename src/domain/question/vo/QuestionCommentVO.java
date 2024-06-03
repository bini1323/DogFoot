package domain.question.vo;

public class QuestionCommentVO {

	private String commentQuestionId;
	private String content;
	private String userId;
	private String boardQuestionId;
	private String deleteyn;
	private String createDate;
	private String modifieDate;
	
	
	
	
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

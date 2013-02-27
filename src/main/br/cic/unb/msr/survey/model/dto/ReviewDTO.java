package br.cic.unb.msr.survey.model.dto;

import br.cic.unb.msr.survey.model.BooleanReview;
import br.cic.unb.msr.survey.model.BugCategory;

public class ReviewDTO {
	private String shortDescription;
	private String description;
	private String url;
	private BugCategory category;
	private BooleanReview attachment;
	private BooleanReview enumeration;
	private BooleanReview sourceCode;
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public BugCategory getCategory() {
		return category;
	}
	public void setCategory(BugCategory category) {
		this.category = category;
	}
	public BooleanReview getAttachment() {
		return attachment;
	}
	public void setAttachment(BooleanReview attachment) {
		this.attachment = attachment;
	}
	public BooleanReview getEnumeration() {
		return enumeration;
	}
	public void setEnumeration(BooleanReview enumeration) {
		this.enumeration = enumeration;
	}
	public BooleanReview getSourceCode() {
		return sourceCode;
	}
	public void setSourceCode(BooleanReview sourceCode) {
		this.sourceCode = sourceCode;
	}
	
	

}

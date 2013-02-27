package br.cic.unb.msr.survey.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_REVIEW")
public class Review {
	
	@EmbeddedId
	private ReviewId id;
	
	@ManyToOne
	@JoinColumn(name="USERID")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="BUGREPORTID")
	private BugReport bugReport;
	
	@ManyToOne(optional=true)
	private BugCategory category;
	
	@Column(name="ATTACHMENT",nullable=true)
	@Enumerated(EnumType.ORDINAL)
	private BooleanReview attachment;
	
	@Column(name="ENUMERATION", nullable=true)
	@Enumerated(EnumType.ORDINAL)
	private BooleanReview enumeration;
	
	@Column(name="SOURCE_CODE", nullable=true)
	@Enumerated(EnumType.ORDINAL)
	private BooleanReview sourceCode;
	
	@Column(name="REVIWED", nullable=true)
	private Boolean reviewed; 

	public ReviewId getId() {
		return id;
	}

	public void setId(ReviewId id) {
		this.id = id;
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

	public Boolean getReviewed() {
		return reviewed;
	}

	public void setReviewed(Boolean reviewed) {
		this.reviewed = reviewed;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BugReport getBugReport() {
		return bugReport;
	}

	public void setBugReport(BugReport bugReport) {
		this.bugReport = bugReport;
	}
	
}

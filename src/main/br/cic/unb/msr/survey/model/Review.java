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
	private Boolean attachment;
	
	@Column(name="ENUMERATION", nullable=true)
	private Boolean enumeration;
	
	@Column(name="SOURCE_CODE", nullable=true)
	private Boolean sourceCode;
	
	@Column(name="REVIWED", nullable=true)
	private Boolean reviewed; 
	
	public Review() {
		enumeration = false;
		attachment = false; 
		sourceCode = false; 
	}

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

	public Boolean getAttachment() {
		return attachment;
	}

	
	public void setAttachment(Boolean attachment) {
		this.attachment = attachment;
	}

	public Boolean getEnumeration() {
		return enumeration;
	}

	
	public void setEnumeration(Boolean enumeration) {
		this.enumeration = enumeration;
	}

	public Boolean getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(Boolean sourceCode) {
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

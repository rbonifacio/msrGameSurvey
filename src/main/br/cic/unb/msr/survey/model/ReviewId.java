package br.cic.unb.msr.survey.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ReviewId implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long userId;
	private Long bugReportId;

	public ReviewId() {
		
	}
	
	public ReviewId(Long userId, Long bugReportId) {
		this.userId = userId;
		this.bugReportId = bugReportId;
	}

	public Long getUserID() {
		return userId;
	}

	public void setUserID(Long userID) {
		userId = userID;
	}

	public Long getBugReportId() {
		return bugReportId;
	}

	public void setBugReportId(Long bugReportId) {
		this.bugReportId = bugReportId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bugReportId == null) ? 0 : bugReportId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ReviewId) {
			ReviewId other = (ReviewId) obj;
			return other.getBugReportId().equals(this.bugReportId)
					&& other.getUserID().equals(this.userId);
		}
		return false;
	}
}

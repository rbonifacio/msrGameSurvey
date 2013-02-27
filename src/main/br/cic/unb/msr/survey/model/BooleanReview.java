package br.cic.unb.msr.survey.model;

public enum BooleanReview {
	PENDING(-1L,"Pending"),
	FALSE(0L, "False"),
	TRUE(1L, "True");
	
	private Long code;
	private String status;
	
	private BooleanReview(Long code, String status) {
		this.code = code;
		this.status = status;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

package com.vision.erp.service.domain;

public class Approval {
	//field
	private String approvalNo;
	private String approvalTitle;
	private String approvalContent;
	private String submitDate;
	private Approver firstApprover;
	private Approver secondApprover;
	private Approver thirdApprover;
	private Approver fourthApprover;
	private Approver fifthApprover;
	private String approvalFormNo;
	private String approvalStatusCodeNo;
	private String approvalStatusCodeName;
	private String approverCount;
	
	//constructor
	public Approval() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter, setter
	public String getApprovalNo() {
		return approvalNo;
	}

	public void setApprovalNo(String approvalNo) {
		this.approvalNo = approvalNo;
	}
	public String getApprovalTitle() {
		return approvalTitle;
	}
	public void setApprovalTitle(String approvalTitle) {
		this.approvalTitle = approvalTitle;
	}
	public String getApprovalContent() {
		return approvalContent;
	}
	public void setApprovalContent(String approvalContent) {
		this.approvalContent = approvalContent;
	}
	public String getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(String submitDate) {
		this.submitDate = submitDate;
	}

	public Approver getFirstApprover() {
		return firstApprover;
	}

	public void setFirstApprover(Approver firstApprover) {
		this.firstApprover = firstApprover;
	}

	public Approver getSecondApprover() {
		return secondApprover;
	}

	public void setSecondApprover(Approver secondApprover) {
		this.secondApprover = secondApprover;
	}

	public Approver getThirdApprover() {
		return thirdApprover;
	}

	public void setThirdApprover(Approver thirdApprover) {
		this.thirdApprover = thirdApprover;
	}

	public Approver getFourthApprover() {
		return fourthApprover;
	}

	public void setFourthApprover(Approver fourthApprover) {
		this.fourthApprover = fourthApprover;
	}

	public Approver getFifthApprover() {
		return fifthApprover;
	}

	public void setFifthApprover(Approver fifthApprover) {
		this.fifthApprover = fifthApprover;
	}

	public String getApprovalFormNo() {
		return approvalFormNo;
	}
	public void setApprovalFormNo(String approvalFormNo) {
		this.approvalFormNo = approvalFormNo;
	}
	public String getApprovalStatusCodeNo() {
		return approvalStatusCodeNo;
	}
	public void setApprovalStatusCodeNo(String approvalStatusCodeNo) {
		this.approvalStatusCodeNo = approvalStatusCodeNo;
	}
	public String getApprovalStatusCodeName() {
		return approvalStatusCodeName;
	}
	public void setApprovalStatusCodeName(String approvalStatusCodeName) {
		this.approvalStatusCodeName = approvalStatusCodeName;
	}
	public String getApproverCount() {
		return approverCount;
	}

	public void setApproverCount(String approverCount) {
		this.approverCount = approverCount;
	}

	//toString
	@Override
	public String toString() {
		return "Approval [approvalNo=" + approvalNo + ", approvalTitle=" + approvalTitle + ", approvalContent="
				+ approvalContent + ", submitDate=" + submitDate + ", firstApprover=" + firstApprover
				+ ", secondApprover=" + secondApprover + ", thirdApprover=" + thirdApprover + ", fourthApprover="
				+ fourthApprover + ", fifthApprover=" + fifthApprover + ", approvalFormNo=" + approvalFormNo
				+ ", approvalStatusCodeNo=" + approvalStatusCodeNo + ", approvalStatusCodeName="
				+ approvalStatusCodeName + ", approverCount=" + approverCount + "]";
	}
	
	
	
}

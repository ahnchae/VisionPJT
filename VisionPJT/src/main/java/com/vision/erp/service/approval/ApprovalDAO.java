package com.vision.erp.service.approval;

import java.util.List;

import com.vision.erp.service.domain.ApprovalForm;

public interface ApprovalDAO {

	/////////////////////���缭���//////////////////////////
	//���缭��� ����Ʈ ��������
	public List<ApprovalForm> selectApprovalFormList() throws Exception;
	
	//���缭��� ����ϱ�, �����ϱ�
	public int insertApprovalForm(ApprovalForm approvalForm) throws Exception;
	
	//���缭��� �����ϱ�
	public int updateApprovalForm() throws Exception;
	
	//���缭��� �󼼺���
	public ApprovalForm selectApprovalFormDetail() throws Exception;
	
	//���缭��� ����, �����ϱ�
	public int updateApprovalFormUsageStatus() throws Exception;

	//���缭��� useCount �ø���
	public int updateApprovalFormUseCount() throws Exception;
	
	/////////////////////����/////////////////////////////
	
	
}

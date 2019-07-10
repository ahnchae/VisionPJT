package com.vision.erp.service.approval;

import java.util.List;

import com.vision.erp.service.domain.ApprovalForm;

public interface ApprovalDAO {

	/////////////////////결재서양식//////////////////////////
	//결재서양식 리스트 가져오기
	public List<ApprovalForm> selectApprovalFormList() throws Exception;
	
	//결재서양식 등록하기, 복제하기
	public int insertApprovalForm(ApprovalForm approvalForm) throws Exception;
	
	//결재서양식 수정하기
	public int updateApprovalForm() throws Exception;
	
	//결재서양식 상세보기
	public ApprovalForm selectApprovalFormDetail() throws Exception;
	
	//결재서양식 삭제, 복구하기
	public int updateApprovalFormUsageStatus() throws Exception;

	//결재서양식 useCount 올리기
	public int updateApprovalFormUseCount() throws Exception;
	
	/////////////////////결재/////////////////////////////
	
	
}

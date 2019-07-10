package com.vision.erp.service.approval.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

import com.vision.erp.service.approval.ApprovalDAO;
import com.vision.erp.service.domain.ApprovalForm;

public class ApprovalDAOImpl implements ApprovalDAO {
	
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	//결재서양식 리스트 가져오기
	@Override
	public List<ApprovalForm> selectApprovalFormList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("ApprovalFormMapper.selectApprovalFormList");
	}

	//결재서양식 등록하기, 복제하기
	@Override
	public int insertApprovalForm(ApprovalForm approvalForm) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	//결재서양식 수정하기
	@Override
	public int updateApprovalForm() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	//결재서양식 상세보기
	@Override
	public ApprovalForm selectApprovalFormDetail() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	//결재서양식 삭제, 복구하기
	@Override
	public int updateApprovalFormUsageStatus() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	//결재서양식 useCount 올리기
	@Override
	public int updateApprovalFormUseCount() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}

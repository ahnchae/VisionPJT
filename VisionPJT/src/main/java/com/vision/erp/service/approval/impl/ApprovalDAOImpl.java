package com.vision.erp.service.approval.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

import com.vision.erp.service.approval.ApprovalDAO;
import com.vision.erp.service.domain.ApprovalForm;

public class ApprovalDAOImpl implements ApprovalDAO {
	
	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	//���缭��� ����Ʈ ��������
	@Override
	public List<ApprovalForm> selectApprovalFormList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("ApprovalFormMapper.selectApprovalFormList");
	}

	//���缭��� ����ϱ�, �����ϱ�
	@Override
	public int insertApprovalForm(ApprovalForm approvalForm) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	//���缭��� �����ϱ�
	@Override
	public int updateApprovalForm() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	//���缭��� �󼼺���
	@Override
	public ApprovalForm selectApprovalFormDetail() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	//���缭��� ����, �����ϱ�
	@Override
	public int updateApprovalFormUsageStatus() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	//���缭��� useCount �ø���
	@Override
	public int updateApprovalFormUseCount() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}

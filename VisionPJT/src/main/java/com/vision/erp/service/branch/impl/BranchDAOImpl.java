package com.vision.erp.service.branch.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.vision.erp.common.Search;
import com.vision.erp.service.branch.BranchDAO;
import com.vision.erp.service.domain.Branch;

@Repository("branchDAOImpl")
public class BranchDAOImpl implements BranchDAO {
	
	@Resource(name="sqlSession")
	private SqlSession sqlsession;

	@Override
	public void insertBranch(Branch branch) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Branch selectBranchDetail(String branchNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBranch(String branchNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Branch> selectBranchList(Search saerch) throws Exception {
		// TODO Auto-generated method stub
		return sqlsession.selectList("BranchMapper.selectBranchList");
	}
	
	

}

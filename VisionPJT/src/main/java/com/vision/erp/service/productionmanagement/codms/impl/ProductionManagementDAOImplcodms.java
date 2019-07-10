package com.vision.erp.service.productionmanagement.codms.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.vision.erp.common.Search;
import com.vision.erp.service.domain.OrderFromBranch;
import com.vision.erp.service.domain.OrderFromBranchProduct;
import com.vision.erp.service.productionmanagement.codms.ProductionManagementDAOcodms;

@Repository("productManagementDAOImplcodms")
public class ProductionManagementDAOImplcodms implements ProductionManagementDAOcodms {
	//field
	@Resource(name="sqlSession")
	private SqlSession sqlSession;

	//[����]�ֹ���û-�ֹ������
	@Override
	public int insertOrderFromBranch(OrderFromBranch orderFromBranch) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("OrderFromBranchMapper.insertOrderFromBranch", orderFromBranch);
	}

	//[����]�ֹ���û-�ֹ���ǰ���
	@Override
	public int insertOrderFromBranchProduct(OrderFromBranchProduct orderFromBranchProduct) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("OrderFromBranchMapper.insertOrderFromBranchProduct", orderFromBranchProduct);
	}

	//[����, ����]�ֹ������º���(�ֹ���ҿ�û, �ֹ����Ȯ��, �ֹ��Ϸ�)
	@Override
	public int updateOrderFromBranchStatus(OrderFromBranch orderFromBranch) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update("OrderFromBranchMapper.updateOrderFromBranchStatus", orderFromBranch);
	}

	//[����, ����]�ֹ�������Ʈ ��������(�ֹ���ǰ ä����) ������ȣ searchKeyword�� ä���
	@Override
	public List<OrderFromBranch> selectOrderFromBranch(Search search) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("OrderFromBranchMapper.selectOrderFromBranch", search);
	}

	//[����]�ֹ���ǰ ���º���(���ϿϷ�, ���ϴ��, �������)
	@Override
	public int updateOrderFromBranchProductStatus(OrderFromBranchProduct orderFromBranchProduct) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update("OrderFromBranchMapper.updateOrderFromBranchProductStatus", orderFromBranchProduct);
	}

	//[����]�ֹ���ǰ ��� ���ϿϷ����� Ȯ��, ���ϴ���� ��ǰ���� return
	@Override
	public int selectOrderFromBranchProduct(OrderFromBranch orderFromBranch) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("OrderFromBranchMapper.selectOrderFromBranchProduct", orderFromBranch).size();
	}

	
}

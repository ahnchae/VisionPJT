package com.vision.erp.service.productionmanagement.codms;

import java.util.List;

import com.vision.erp.common.Search;
import com.vision.erp.service.domain.OrderFromBranch;
import com.vision.erp.service.domain.OrderFromBranchProduct;

public interface ProductionManagementDAOcodms {
	//[����]�ֹ���û-�ֹ������
	public int insertOrderFromBranch(OrderFromBranch orderFromBranch) throws Exception;
	
	//[����]�ֹ���û-�ֹ���ǰ���
	public int insertOrderFromBranchProduct(OrderFromBranchProduct orderFromBranchProduct) throws Exception;
		
	//[����, ����]�ֹ������º���(�ֹ���ҿ�û, �ֹ����Ȯ��, �ֹ��Ϸ�)
	public int updateOrderFromBranchStatus(OrderFromBranch orderFromBranch) throws Exception;
	
	//[����, ����]�ֹ�������Ʈ ��������(�ֹ���ǰ ä����) ������ȣ searchKeyword�� ä���
	public List<OrderFromBranch> selectOrderFromBranch(Search search) throws Exception;
	
	//[����]�ֹ���ǰ ���º���(���ϿϷ�, ���ϴ��, �������)
	public int updateOrderFromBranchProductStatus(OrderFromBranchProduct orderFromBranchProduct) throws Exception;
	
	//[����]�ֹ���ǰ ��� ���ϿϷ����� Ȯ��, ���ϴ���� ��ǰ���� return
	public int selectOrderFromBranchProduct(OrderFromBranch orderFromBranch) throws Exception;
	
}

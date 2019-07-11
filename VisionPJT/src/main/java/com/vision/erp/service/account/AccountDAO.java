package com.vision.erp.service.account;

import java.util.List;

import com.vision.erp.common.Search;
import com.vision.erp.service.domain.Account;

public interface AccountDAO {

	public void insertAccount(Account account) throws Exception;
	
	public Account selectAccountDetail(int accountRegNo) throws Exception;
	
	public List<Account> selectAccountList(Search search) throws Exception;
	
	public void updateAccount(Account account) throws Exception;
	
	public void updateAccountUsageStatus(int accountUsageStatusCodeNo) throws Exception;
	
	public Account checkDuplicateAccount(int accountNo) throws Exception;
}

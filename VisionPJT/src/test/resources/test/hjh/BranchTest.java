package test.hjh;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vision.erp.common.Search;
import com.vision.erp.service.branch.BranchDAO;
import com.vision.erp.service.domain.Branch;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:config/root-context.xml",
		"classpath:config/aspect-context.xml",
		"classpath:config/servlet-context.xml",
		"classpath:config/transaction-context.xml"
})
public class BranchTest{

	@Resource(name = "branchDAOImpl")
	private BranchDAO branchDAO;
	
	@Test
	public void testSelectBranchList() throws Exception {
		
		Search search = new Search();
		
		List<Branch> list 
				= (List<Branch>)branchDAO.selectBranchList(search);
		
		for(int i = 0; i<list.size(); i++) {
			Branch branch = list.get(i);
			System.out.println(branch);
		}
		
	}

}

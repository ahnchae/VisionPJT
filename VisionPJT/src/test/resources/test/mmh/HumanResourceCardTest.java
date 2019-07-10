package test.mmh;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vision.erp.common.Search;
import com.vision.erp.service.domain.HumanResourceCard;
import com.vision.erp.service.humanresouce.HumanResourceDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:config/root-context.xml",
		"classpath:config/aspect-context.xml",
		"classpath:config/servlet-context.xml",
		"classpath:config/transaction-context.xml"
})
public class HumanResourceCardTest{

	@Resource(name = "humanResourceDAOImpl")
	private HumanResourceDAO humanResourceDAO;
	
	@Test
	public void testSelectHumanResourceCardList() throws Exception {
		
		Search search = new Search();
		
		List<HumanResourceCard> list 
				= (List<HumanResourceCard>)humanResourceDAO.selectHumanResourceCardList(search);
		
		for(int i = 0; i<list.size(); i++) {
			HumanResourceCard humanResourceCard = list.get(i);
			System.out.println(humanResourceCard);
		}
		
	}

}

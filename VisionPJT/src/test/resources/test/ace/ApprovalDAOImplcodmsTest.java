package test.ace;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vision.erp.service.approval.ApprovalDAO;
import com.vision.erp.service.domain.Approval;
import com.vision.erp.service.domain.ApprovalForm;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:config/root-context.xml",
		"classpath:config/aspect-context.xml",
		"classpath:config/servlet-context.xml",
		"classpath:config/transaction-context.xml"
})

public class ApprovalDAOImplcodmsTest{

	@Resource(name = "approvalDAOImpl")
	private ApprovalDAO approvalDAO;
	
	/////////////////////결재서양식//////////////////////////
	//결재서양식 리스트 가져오기
	//@Test
	public void selectApprovalFormListTest() throws Exception{
		List<ApprovalForm> list = approvalDAO.selectApprovalFormList();
		for(ApprovalForm af : list) {
			System.out.println(af);
		}
	}
	
	//결재서양식 등록하기, 복제하기
	//@Test
	public void insertApprovalForm() throws Exception{
		ApprovalForm af = new ApprovalForm("휴가신청서", "<table style=\"width: 216pt;\" border=\"0\" width=\"288\" cellspacing=\"0\" cellpadding=\"0\"><colgroup><col style=\"width: 54pt;\" span=\"4\" width=\"72\" /> </colgroup> <tbody> <tr style=\"height: 16.5pt;\"> <td class=\"xl65\" style=\"height: 16.5pt; width: 216pt;\" colspan=\"4\" width=\"288\" height=\"22\">휴가신청서</td> </tr> <tr style=\"height: 16.5pt;\"> <td style=\"height: 16.5pt;\" height=\"22\">신청인</td> <td>&nbsp;</td> <td>&nbsp;</td> <td>&nbsp;</td> </tr> <tr style=\"height: 16.5pt;\"> <td style=\"height: 16.5pt;\" height=\"22\">기간</td> <td>&nbsp;</td> <td>&nbsp;</td> <td>&nbsp;</td> </tr> <tr style=\"height: 16.5pt;\"> <td style=\"height: 16.5pt;\" height=\"22\">사유</td> <td>&nbsp;</td> <td>&nbsp;</td> <td>&nbsp;</td> </tr> <tr style=\"height: 16.5pt;\"> <td style=\"height: 16.5pt;\" height=\"22\">&nbsp;</td> <td>&nbsp;</td> <td>&nbsp;</td> <td>&nbsp;</td> </tr> <tr style=\"height: 16.5pt;\"> <td class=\"xl65\" style=\"height: 16.5pt;\" colspan=\"4\" height=\"22\">위와같이 휴가를 신청합니다.</td> </tr> </tbody> </table>", "1002", "한제헌");
		int i =  approvalDAO.insertApprovalForm(af);
		System.out.println(i);
	}
	
	//결재서양식 수정하기
	//@Test
	public void updateApprovalFormTest() throws Exception{
		ApprovalForm af = new ApprovalForm("기본기안서", "<table style=\"width: 216pt;\" border=\"0\" width=\"288\" cellspacing=\"0\" cellpadding=\"0\"><colgroup><col style=\"width: 54pt;\" span=\"4\" width=\"72\" /> </colgroup> <tbody> <tr style=\"height: 16.5pt;\"> <td class=\"xl63\" style=\"height: 16.5pt; width: 216pt;\" colspan=\"4\" width=\"288\" height=\"22\">기본기안서</td> </tr> <tr style=\"height: 16.5pt;\"> <td style=\"height: 16.5pt;\" height=\"22\">협의</td> <td>&nbsp;</td> <td>&nbsp;</td> <td>&nbsp;</td> </tr> <tr style=\"height: 16.5pt;\"> <td style=\"height: 16.5pt;\" height=\"22\">제목</td> <td>&nbsp;</td> <td>&nbsp;</td> <td>&nbsp;</td> </tr> <tr style=\"height: 16.5pt;\"> <td class=\"xl63\" style=\"height: 16.5pt;\" colspan=\"4\" height=\"22\">내용</td> </tr> <tr style=\"height: 16.5pt;\"> <td class=\"xl63\" style=\"height: 66.0pt;\" colspan=\"4\" rowspan=\"4\" height=\"88\">&nbsp;</td> </tr> </tbody> </table>", "1001", "안채은");
		af.setApprovalFormNo("10001");
		int i = approvalDAO.updateApprovalForm(af);
		System.out.println(i);
	}
	
	//결재서양식 상세보기
	//@Test
	public void selectApprovalFormDetailTest() throws Exception{
		ApprovalForm af = approvalDAO.selectApprovalFormDetail("10001");
		System.out.println(af);
	}
	
	//결재서양식 삭제하기
	//@Test
	public void updateApprovalFormUsageStatusTest() throws Exception{
		ApprovalForm af = new ApprovalForm("기본기안서", "<table style=\"width: 216pt;\" border=\"0\" width=\"288\" cellspacing=\"0\" cellpadding=\"0\"><colgroup><col style=\"width: 54pt;\" span=\"4\" width=\"72\" /> </colgroup> <tbody> <tr style=\"height: 16.5pt;\"> <td class=\"xl63\" style=\"height: 16.5pt; width: 216pt;\" colspan=\"4\" width=\"288\" height=\"22\">기본기안서</td> </tr> <tr style=\"height: 16.5pt;\"> <td style=\"height: 16.5pt;\" height=\"22\">협의</td> <td>&nbsp;</td> <td>&nbsp;</td> <td>&nbsp;</td> </tr> <tr style=\"height: 16.5pt;\"> <td style=\"height: 16.5pt;\" height=\"22\">제목</td> <td>&nbsp;</td> <td>&nbsp;</td> <td>&nbsp;</td> </tr> <tr style=\"height: 16.5pt;\"> <td class=\"xl63\" style=\"height: 16.5pt;\" colspan=\"4\" height=\"22\">내용</td> </tr> <tr style=\"height: 16.5pt;\"> <td class=\"xl63\" style=\"height: 66.0pt;\" colspan=\"4\" rowspan=\"4\" height=\"88\">&nbsp;</td> </tr> </tbody> </table>", "1001", "안채은");
		af.setApprovalFormNo("10001");
		af.setApprovalFormUsageStatusCodeNo("01");
		int i = approvalDAO.updateApprovalFormUsageStatus(af);
		System.out.println(i);
	}
	
	//결재서양식 useCount 올리기
	//@Test
	public void updateApprovalFormUseCountTest() throws Exception{
		int i = approvalDAO.updateApprovalFormUseCount("10001");
		System.out.println(i);
		//selectApprovalFormDetailTest();
	}
	
	
	/////////////////////결재/////////////////////////////
	//결재상신
	@Test
	public void insertApprovalTest() throws Exception{
		Approval ap = new Approval();
		
		approvalDAO.insertApproval(ap);
	}
	
	//결재자 등록하기
	
	
	//결재자 가져오기
	
	
	//결재목록 가져오기(상신, 반려, 완료, 대기)
	
	
	//결재서 상세보기
	
	
	//결재서상태 변경하기(진행, 완료, 반려)
	
	
	//결재자의 결재상태 변경하기(승인, 반려)
	
	
	//승인한결재자수 변경하기
	
	
	
}
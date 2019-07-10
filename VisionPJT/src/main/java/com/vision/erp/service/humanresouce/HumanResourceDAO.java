package com.vision.erp.service.humanresouce;

import java.util.List;

import com.vision.erp.common.Search;
import com.vision.erp.service.domain.Appointment;
import com.vision.erp.service.domain.Commute;
import com.vision.erp.service.domain.Department;
import com.vision.erp.service.domain.DutyHours;
import com.vision.erp.service.domain.HumanResourceCard;
import com.vision.erp.service.domain.WorkAttitude;
import com.vision.erp.service.domain.WorkAttitudeCode;

public interface HumanResourceDAO {

	public void insertHumanResource(HumanResourceCard humanResourceCard) throws Exception;
	
	public List<HumanResourceCard> selectHumanResourceCardList(Search search) throws Exception;
	
	public HumanResourceCard selectHumanResourceCardDetailByEmployeeNo(int employeeNo) throws Exception;
	
	public HumanResourceCard selectSimpleHumanResourceCardByEmployeeNo(int employeeNo) throws Exception;
	
	public void updateHumanResourceCard(HumanResourceCard humanResourceCard) throws Exception;
	
	public void insertWorkAttitude(WorkAttitude workAttitude) throws Exception;
	
	public List<WorkAttitude> selectWorkAttitudeList(Search search) throws Exception;
	
	public void updateWorkAttitude(WorkAttitude workAttitude) throws Exception;
	
	public void updateWorkAttitudeUsageStatus(int workAttitudeNo, String usageStatus) throws Exception;
	
	public void insertWorkAttitudeCode(WorkAttitudeCode workAttitudeCode) throws Exception;
	
	public List<WorkAttitudeCode> selectWorkAttitudeCodeList(Search search) throws Exception;
	
	public void updateWorkAttitudeCode(WorkAttitudeCode workAttitudeCode) throws Exception;
	
	public void updateWorkAttitudeCodeUsageStatus(int workAttitudeCodeNo, String usageStatus) throws Exception;
	
	public void insertAppointment(Appointment appointment) throws Exception;
	
	public List<Appointment> selectAppointmentList(Search search) throws Exception;
	
	public void updateAppointment(Appointment appointment) throws Exception;
	
	public void updateAppointmentStatus(int appointmentNo, String status) throws Exception;
	
	public void insertDepartment(Department department) throws Exception;
	
	public List<Department> selectDepartmentList(Search search) throws Exception;
	
	public void updateDepartment(Department department) throws Exception;
	
	public void updateDepartmentUsageStatus(int departCodeNo, String status) throws Exception;
	
	public List<Commute> selectCommuteList(Search search) throws Exception;
	
	public void insertCommute(Commute commute) throws Exception;
	
	public void insertDutyHours(DutyHours dutyHours) throws Exception;
	
	public String selectSignatureImageByEmployeeNo(int employeeNo) throws Exception;
	
}

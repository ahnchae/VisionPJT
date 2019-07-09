package com.vision.erp.service.humanresouce.impl;

import java.util.List;

import com.vision.erp.common.Search;
import com.vision.erp.service.domain.Appointment;
import com.vision.erp.service.domain.Commute;
import com.vision.erp.service.domain.Department;
import com.vision.erp.service.domain.DutyHours;
import com.vision.erp.service.domain.HumanResourceCard;
import com.vision.erp.service.domain.WorkAttitude;
import com.vision.erp.service.domain.WorkAttitudeCode;
import com.vision.erp.service.humanresouce.HumanResourceDAO;

public class HumanResourceDAOImpl implements HumanResourceDAO {

	@Override
	public void insertHumanResource(HumanResourceCard humanResourceCard) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<HumanResourceCard> selectHumanResourceCardList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HumanResourceCard selectHumanResourceCardDetailByEmployeeNo(int employeeNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HumanResourceCard selectSimpleHumanResourceCardByEmployeeNo(int employeeNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateHumanResourceCard(HumanResourceCard humanResourceCard) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertWorkAttitude(WorkAttitude workAttitude) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<WorkAttitude> selectWorkAttitudeList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateWorkAttitude(WorkAttitude workAttitude) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateWorkAttitudeUsageStatus(int workAttitudeNo, String usageStatus) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertWorkAttitudeCode(WorkAttitudeCode workAttitudeCode) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<WorkAttitudeCode> selectWorkAttitudeCodeList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateWorkAttitudeCode(WorkAttitudeCode workAttitudeCode) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateWorkAttitudeCodeUsageStatus(int workAttitudeCodeNo, String usageStatus) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAppointment(Appointment appointment) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Appointment> selectAppointmentList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAppointment(Appointment appointment) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAppointmentStatus(int appointmentNo, String status) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertDepartment(Department department) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Department> selectDepartmentList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDepartment(Department department) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDepartmentUsageStatus(int departCodeNo, String status) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Commute> selectCommuteList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertCommute(Commute commute) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertDutyHours(DutyHours dutyHours) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String selectSignatureImageByEmployeeNo(int employeeNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

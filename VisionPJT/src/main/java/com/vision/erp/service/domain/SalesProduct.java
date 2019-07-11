package com.vision.erp.service.domain;

public class SalesProduct {
	//field
	private String branchSalesNo;
	private String salesDate;
	private String menuName;
	private String salesPrice;
	private String salesAmount;
	private String salesQuantity;
	private String salesNumbering;
	
	
	//constructor
	public SalesProduct() {		
		// TODO Auto-generated constructor stub
	}


	public String getBranchSalesNo() {
		return branchSalesNo;
	}


	public void setBranchSalesNo(String branchSalesNo) {
		this.branchSalesNo = branchSalesNo;
	}


	public String getSalesDate() {
		return salesDate;
	}


	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}


	public String getMenuName() {
		return menuName;
	}


	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}


	public String getSalesPrice() {
		return salesPrice;
	}


	public void setSalesPrice(String salesPrice) {
		this.salesPrice = salesPrice;
	}


	public String getSalesAmount() {
		return salesAmount;
	}


	public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
	}


	public String getSalesQuantity() {
		return salesQuantity;
	}


	public void setSalesQuantity(String salesQuantity) {
		this.salesQuantity = salesQuantity;
	}


	public String getSalesNumbering() {
		return salesNumbering;
	}


	public void setSalesNumbering(String salesNumbering) {
		this.salesNumbering = salesNumbering;
	}


	@Override
	public String toString() {
		return "SalesProduct [branchSalesNo=" + branchSalesNo + ", salesDate=" + salesDate + ", menuName=" + menuName
				+ ", salesPrice=" + salesPrice + ", salesAmount=" + salesAmount + ", salesQuantity=" + salesQuantity
				+ ", salesNumbering=" + salesNumbering + "]";
	}	
	
}
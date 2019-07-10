package com.vision.erp.common;

public class Search {
	//field
	private String searchCondition;
	private String searchKeyword;
	
	//constructor
	public Search() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Search(String searchCondition, String searchKeyword) {
		super();
		this.searchCondition = searchCondition;
		this.searchKeyword = searchKeyword;
	}

	//getter, setter
	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	//toString
	@Override
	public String toString() {
		return "Search [searchCondition=" + searchCondition + ", searchKeyword=" + searchKeyword + "]";
	}
	
	

}

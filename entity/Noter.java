package entity;

import java.util.Date;

public class Noter {
	private int id;
	private Date datetime;
	private String sort;
	private String caption;
	private String remarks;
	
	public Noter(Date datetime,String sort,String caption,String remarks){		
		this.datetime = datetime;
		this.sort = sort;
		this.caption = caption;
		this.remarks = remarks;		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

}

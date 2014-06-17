package entity;

import java.util.Date;

public class AddrBooker {
	private int id;
	private String name;
	private String sex;
	private String type;
	private String phone;
	private String email;
	private String company;
	private String adress;
	private String remarks;
	
	public AddrBooker(String name ,String sex ,String type,String phone,String email ,String company,String adress ,String remarks ){		
		this.name = name;
		this.sex = sex;
		this.type = type;	
		this.phone = phone;
		this.email = email;
		this.remarks = remarks;	
		this.company = company;
		this.adress = adress;		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}

package com.hibernate.hibernate_28_09_labprog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name="Product_info")//giving the name to the table
@Entity(name="Product_Details")//we are declaring the entity file
public class Product {

	@Id//declaring the primary key
	@Column(name="Product_ID")
	private int pid;
	
	@Column(name="Product_name")
	private String pname;
	
	@Column(name="Product_Price")
	private int p_price;

	//constructors
	public Product(int pid, String pname, int p_price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.p_price = p_price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	
	
	
	
	}

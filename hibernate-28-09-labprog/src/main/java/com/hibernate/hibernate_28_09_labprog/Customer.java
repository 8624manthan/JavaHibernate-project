package com.hibernate.hibernate_28_09_labprog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="Customer_Info")//giving the name to the table
@Entity(name="Customer_Details")//we are declaring the entity file
public class Customer {

	@Id  //declaring the primary key
	@Column(name="Customer_ID")
	private int cid;
	
	@Column(name="Customer_name")
	private String cname;
	
	@Column(name="Customer_contact")
	private int  cmobile;
	
	@OneToOne  //one to one connection
	@JoinColumn(name="Product_ID")
	private Product Prod;
	
	//constructors
	public Customer(int cid, String cname, int cmobile, Product prod) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmobile = cmobile;
		Prod = prod;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCmobile() {
		return cmobile;
	}

	public void setCmobile(int cmobile) {
		this.cmobile = cmobile;
	}

	public Product getProd() {
		return Prod;
	}

	public void setProd(Product prod) {
		Prod = prod;
	}


		
	
	
}

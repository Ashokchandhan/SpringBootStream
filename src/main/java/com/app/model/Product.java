package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private Integer prodId;
	private String prodcode;
	private Double prodcost;
	public Product() {
		super();
	}
	public Product(Integer prodId, String prodcode, double prodcost) {
		super();
		this.prodId = prodId;
		this.prodcode = prodcode;
		this.prodcost = prodcost;
	}
	public Product(String prodcode, double prodcost) {
		super();
		this.prodcode = prodcode;
		this.prodcost = prodcost;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdcode() {
		return prodcode;
	}
	public void setProdcode(String prodcode) {
		this.prodcode = prodcode;
	}
	public double getProdcost() {
		return prodcost;
	}
	public void setProdcost(double prodcost) {
		this.prodcost = prodcost;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodcode=" + prodcode + ", prodcost=" + prodcost + "]";
	}

}

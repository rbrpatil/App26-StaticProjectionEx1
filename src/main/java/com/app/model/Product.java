package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Product {
	@Id
	private int prodId;
	private String prodCode;
	private Double prodCost;
	private String prodVendor;
	private String prodModel;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	public String getProdVendor() {
		return prodVendor;
	}
	public void setProdVendor(String prodVendor) {
		this.prodVendor = prodVendor;
	}
	public String getProdModel() {
		return prodModel;
	}
	public void setProdModel(String prodModel) {
		this.prodModel = prodModel;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + ", prodVendor="
				+ prodVendor + ", prodModel=" + prodModel + "]";
	}
	
	
	
	

}

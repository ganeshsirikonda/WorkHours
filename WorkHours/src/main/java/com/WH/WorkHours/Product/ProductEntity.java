package com.WH.WorkHours.Product;

import org.springframework.stereotype.Component;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Component
@Entity
@Table(name="PRODUCTS")
public class ProductEntity {
	
	@Id
	@Column(name="PRODUCTID")
	private int PRODUCTID;
	
	@Column(name="PRODUCTNAME")
	private String PRODUCTNAME;
	
	public ProductEntity() { }

	public ProductEntity(int pRODUCTID, String pRODUCTNAME) {
		super();
		PRODUCTID = pRODUCTID;
		PRODUCTNAME = pRODUCTNAME;
	}

	@Override
	public String toString() {
		return "ProductEntity [PRODUCTID=" + PRODUCTID + ", PRODUCTNAME=" + PRODUCTNAME + "]";
	}

	public int getPRODUCTID() {
		return PRODUCTID;
	}

	public void setPRODUCTID(int pRODUCTID) {
		PRODUCTID = pRODUCTID;
	}

	public String getPRODUCTNAME() {
		return PRODUCTNAME;
	}

	public void setPRODUCTNAME(String pRODUCTNAME) {
		PRODUCTNAME = pRODUCTNAME;
	}
	


	
	
	
	
	
	
}

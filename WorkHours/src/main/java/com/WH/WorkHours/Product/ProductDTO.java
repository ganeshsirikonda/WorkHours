package com.WH.WorkHours.Product;

public class ProductDTO {
	
	private String PRODUCTNAME;

	public String getPRODUCTNAME() {
		return PRODUCTNAME;
	}
	
	ProductDTO(){}


	public ProductDTO(String pRODUCTNAME) {
		super();
		PRODUCTNAME = pRODUCTNAME;
	}

	public void setPRODUCTNAME(String pRODUCTNAME) {
		PRODUCTNAME = pRODUCTNAME;
	}

}

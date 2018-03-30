/**
 * 
 */
package com.itforall.ams.vo;

import java.util.List;

/**
 * @author TK048537
 *
 */
public class ProductVO {

	private String productId;
	private String productName;
	private List<String> productType;
	private int quanity;
	private int inProgressQuanity;
	
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productType
	 */
	public List<String> getProductType() {
		return productType;
	}
	/**
	 * @param prodType the productType to set
	 */
	public void setProductType(List<String> prodType) {
		this.productType = prodType;
	}
	/**
	 * @return the quanity
	 */
	public int getQuanity() {
		return quanity;
	}
	/**
	 * @param quanity the quanity to set
	 */
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	/**
	 * @return the inProgressQuanity
	 */
	public int getInProgressQuanity() {
		return inProgressQuanity;
	}
	/**
	 * @param inProgressQuanity the inProgressQuanity to set
	 */
	public void setInProgressQuanity(int inProgressQuanity) {
		this.inProgressQuanity = inProgressQuanity;
	}
	
	
	
}

package com.app.dto;

import java.util.Objects;

//TBO.ID,
//TBO.MEMBER_ID,
//TBO.PRODUCT_ID,
//TBO.PRODUCT_COUNT,
//TBO.PRODUCT_COUNT * TBP.PRODUCT_PRICE AS "ORDER_TOTAL_PRICE",
//TBP.PRODUCT_NAME,
//TBP.PRODUCT_PRICE,
//TBP.PRODUCT_STOCK,
//TBM.MEMBER_EMAIL,
//TBM.MEMBER_NAME
public class OrderDTO {
	
	private Long id;
	private Long memberid;
	private Long productCount;
	private Integer orderTotalPrice;
	private String productName;
	private Integer productPrice;
	private Integer productStock;
	private String memberEmail;
	private String memberName;
	
	public OrderDTO() {;}

	public OrderDTO(Long id, Long memberid, Long productCount, Integer orderTotalPrice, String productName,
			Integer productPrice, Integer productStock, String memberEmail, String memberName) {
		super();
		this.id = id;
		this.memberid = memberid;
		this.productCount = productCount;
		this.orderTotalPrice = orderTotalPrice;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
		this.memberEmail = memberEmail;
		this.memberName = memberName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMemberid() {
		return memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public Long getProductCount() {
		return productCount;
	}

	public void setProductCount(Long productCount) {
		this.productCount = productCount;
	}

	public Integer getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(Integer orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductStock() {
		return productStock;
	}

	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "OrderDTO [id=" + id + ", memberid=" + memberid + ", productCount=" + productCount + ", orderTotalPrice="
				+ orderTotalPrice + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productStock=" + productStock + ", memberEmail=" + memberEmail + ", memberName=" + memberName
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDTO other = (OrderDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}

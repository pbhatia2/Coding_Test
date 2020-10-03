package com.engine.promotion;

public class SKU {

	private final String SkuId;
	private final int totalQuantity;
	private int offerPrice;
	
	public SKU(String SkuId, int totalQuantity, int offerPrice)
	{
		this.SkuId = SkuId;
		this.totalQuantity = totalQuantity;
		this.offerPrice = offerPrice;
	}

	public String getSkuId() {
		return SkuId;
	}

	public int getDiscountQuantity() {
		return totalQuantity;
	}

	public int getofferPrice() {
		return offerPrice;
	}
}

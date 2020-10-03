package com.engine.promotion;

import java.util.HashMap;
import java.util.Map;

public class SkuFactoryModel {
 	
	private static Map<String, Integer> offerPrice = new HashMap<>();
	private static final int skuAUnitPrice = 50;
	private static final int skuBUnitPrice = 30;
	private static final int skuCUnitPrice = 20;
	private static final int skuDUnitPrice = 15;
	
	public SkuFactoryModel()
	{
		offerPrice.put("A", skuAUnitPrice);
		offerPrice.put("B", skuBUnitPrice);
		offerPrice.put("C", skuCUnitPrice);
		offerPrice.put("D", skuDUnitPrice);	
	}
	
	public SKU getSKUObject(final String skuId, final int quantity)
	{
		return new SKU(skuId, quantity, offerPrice.get(skuId));
	}
}

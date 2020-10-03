package com.engine.promotion;

import java.util.Map;

public interface InvoiceCalculator {
	
	public int fetchTotal(Map<String, SKU> skuData);
	
}

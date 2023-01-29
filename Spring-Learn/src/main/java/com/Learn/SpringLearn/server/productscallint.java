package com.Learn.SpringLearn.server;

import java.util.List;

import com.Learn.SpringLearn.entity.product;
import com.Learn.SpringLearn.entity.product_category;

public interface productscallint {
	
	 List<product> getAllproducts();
	
	 List<product_category> getAllcategorys();
}

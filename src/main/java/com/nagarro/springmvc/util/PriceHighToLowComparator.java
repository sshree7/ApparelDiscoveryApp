package com.nagarro.springmvc.util;

import java.util.Comparator;
import com.nagarro.springmvc.domain.TShirt;

/**
 * Sorts TShirts according to the highest to lowest the price.
 * 
 * @author shruteishree
 *
 */

public class PriceHighToLowComparator implements Comparator<TShirt> {

	public int compare(TShirt tShirt1, TShirt tShirt2) {
		return Double.compare(tShirt2.getPrice(), tShirt1.getPrice());
	}
}

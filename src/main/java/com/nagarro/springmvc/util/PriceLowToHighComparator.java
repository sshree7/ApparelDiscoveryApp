package com.nagarro.springmvc.util;

import java.util.Comparator;
import com.nagarro.springmvc.domain.TShirt;

/**
 * Sorts TShirts according to the lowest to the highest price.
 * 
 * @author shruteishree
 *
 */

public class PriceLowToHighComparator implements Comparator<TShirt> {

	public int compare(TShirt tShirt1, TShirt tShirt2) {

		return Double.compare(tShirt1.getPrice(), tShirt2.getPrice());
	}
}

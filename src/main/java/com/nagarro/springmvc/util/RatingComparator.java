package com.nagarro.springmvc.util;

import java.util.Comparator;

import com.nagarro.springmvc.domain.TShirt;

/**
 * Sorts according to the ratings(highest to lowest).
 * 
 * @author shruteishree
 *
 */

public class RatingComparator implements Comparator<TShirt> {

	public int compare(TShirt tShirt1, TShirt tShirt2) {
		return Double.compare(tShirt2.getRating(), tShirt1.getRating());
	}
}
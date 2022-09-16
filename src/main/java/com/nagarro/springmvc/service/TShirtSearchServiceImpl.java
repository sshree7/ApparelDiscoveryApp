package com.nagarro.springmvc.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.springmvc.dao.TShirtDao;
import com.nagarro.springmvc.domain.TShirt;
import com.nagarro.springmvc.dto.RequiredTShirtDto;
import com.nagarro.springmvc.util.CommonConstants;
import com.nagarro.springmvc.util.PriceHighToLowComparator;
import com.nagarro.springmvc.util.PriceLowToHighComparator;
import com.nagarro.springmvc.util.RatingComparator;

/**
 * Finds & returns Tshirts that match with the input requirement.
 * 
 * @author shruteishree
 *
 */

@Service
public class TShirtSearchServiceImpl implements TShirtSearchService {
	@Autowired
	private TShirtDao tShirtDao;

	public List<TShirt> getMatchingTShirts(RequiredTShirtDto requiredTShirtDto) {
		final List<TShirt> matchedtShirts = new ArrayList<TShirt>();
		List<TShirt> allTShirts = tShirtDao.getAllTShirts();
		for (final TShirt tShirt : allTShirts) {
			if ((requiredTShirtDto.getColor().equals(tShirt.getColor()))
					&& (requiredTShirtDto.getGender().equals(tShirt.getGender())
							|| tShirt.getGender().toString().equals(CommonConstants.unisexGender))
					&& (requiredTShirtDto.getSize().equals(tShirt.getSize()))) {
				matchedtShirts.add(tShirt);
			}
		}
		Comparator<TShirt> tShirtComparator = null;
		if (requiredTShirtDto.getSortPreference().toUpperCase().equals("R")) {
			tShirtComparator = new RatingComparator();
		} else if (requiredTShirtDto.getSortPreference().toUpperCase().equals("L")) {
			tShirtComparator = new PriceLowToHighComparator();
		} else {
			tShirtComparator = new PriceHighToLowComparator();
		}
		Collections.sort(matchedtShirts, tShirtComparator);
		return matchedtShirts;
	}

}

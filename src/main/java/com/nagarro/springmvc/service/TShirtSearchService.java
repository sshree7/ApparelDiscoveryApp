package com.nagarro.springmvc.service;

import java.util.List;

import com.nagarro.springmvc.domain.TShirt;
import com.nagarro.springmvc.dto.RequiredTShirtDto;

/**
 * Interface-Finds & returns Tshirts that match with the input requirement.
 * 
 * @author shruteishree
 *
 */

public interface TShirtSearchService {

	List<TShirt> getMatchingTShirts(RequiredTShirtDto requiredTShirtDto);

}

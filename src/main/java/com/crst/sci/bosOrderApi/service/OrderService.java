package com.crst.sci.bosOrderApi.service;

import java.util.List;

import com.crst.sci.bosOrderApi.entity.Booker;

/**
 * @author Rohit
 *
 */
public interface OrderService {
	
	/**
	 * @param userId
	 * @return
	 */
	public List<Booker> getBookersByUserId(Long userId);
}

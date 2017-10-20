package com.crst.sci.bosOrderApi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crst.sci.bosOrderApi.entity.Booker;
import com.crst.sci.bosOrderApi.service.impl.OrderServiceImpl;

/**
 * @author Rohit
 *
 */
@RestController
@RequestMapping(value="/orders")
public class OrderController {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private OrderServiceImpl orderService;
	
	/**
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<List<Booker>> getBookersByUserId (@PathVariable("id") String userId) {
		List<Booker> bookers =	orderService.getBookersByUserId(Long.valueOf(userId));
		
		return new ResponseEntity<List<Booker>>(bookers, HttpStatus.OK);
	}
	

}

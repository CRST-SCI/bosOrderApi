package com.crst.sci.bosOrderApi.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crst.sci.bosOrderApi.entity.Booker;
import com.crst.sci.bosOrderApi.entity.User;
import com.crst.sci.bosOrderApi.repository.BookerRepository;
import com.crst.sci.bosOrderApi.repository.UserRepository;
import com.crst.sci.bosOrderApi.service.OrderService;

/**
 * @author Rohit
 *
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BookerRepository bookerRepository;

	/**
	 * @param userId
	 * @return
	 */
	@Override
	public List<Booker> getBookersByUserId(Long userId) {
		User user = userRepository.findById(userId);
		List<Booker> bookers = bookerRepository.findByUser(user);

		logger.info("No of Bookers by user   " + bookers.size());
		return bookers;
	}

}

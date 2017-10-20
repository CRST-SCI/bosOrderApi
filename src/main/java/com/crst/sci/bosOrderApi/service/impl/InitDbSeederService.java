package com.crst.sci.bosOrderApi.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crst.sci.bosOrderApi.entity.Booker;
import com.crst.sci.bosOrderApi.entity.User;
import com.crst.sci.bosOrderApi.repository.BookerRepository;
import com.crst.sci.bosOrderApi.repository.UserRepository;

/**
 * @author Rohit
 *
 */
@Service
public class InitDbSeederService {

	/**
	 * 
	 */
	@Autowired
	private UserRepository userRepository;

	/**
	 * 
	 */
	@Autowired
	private BookerRepository bookerRepository;

	/**
	 * 
	 */
	public InitDbSeederService() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Populate data after initialize the application.
	 */
	@PostConstruct
	public void init() {
		if (userRepository != null || bookerRepository != null) {
			addUserAndBooker();
		}
	}

	/**
	 * To add the initial data of User and Booker with there relation. Forlocal
	 * DB only
	 */
	private void addUserAndBooker() {
		User user1 = new User("Agent1");
		userRepository.save(user1);
		User user2 = new User("Agent2");
		userRepository.save(user2);
		User user3 = new User("Agent3");
		userRepository.save(user3);

		bookerRepository.save(new Booker("booker 1", 111111111L, user1));
		bookerRepository.save(new Booker("booker 2", 222222222L, user1));
		bookerRepository.save(new Booker("booker 3", 333333333L, user2));
		bookerRepository.save(new Booker("booker 4", 444444444L, user2));
		bookerRepository.save(new Booker("booker 5", 555555555L, user3));
	}

}

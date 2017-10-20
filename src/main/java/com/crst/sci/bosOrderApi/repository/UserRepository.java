package com.crst.sci.bosOrderApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crst.sci.bosOrderApi.entity.User;

/**
 * @author Rohit
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * @param userId
	 * @return
	 */
	public User findById(Long userId);
	
}

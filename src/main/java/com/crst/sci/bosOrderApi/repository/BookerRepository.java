package com.crst.sci.bosOrderApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crst.sci.bosOrderApi.entity.Booker;
import com.crst.sci.bosOrderApi.entity.User;

/**
 * @author Rohit
 *
 */
@Repository
public interface BookerRepository extends JpaRepository<Booker, Long> {

	/**
	 * @param user
	 * @return
	 */
	public List<Booker> findByUser(User user);

}

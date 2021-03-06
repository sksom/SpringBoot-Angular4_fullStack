package com.gift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gift.model.User;

/**
 * The Interface UserRepository.
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * All methods like findAll, getByID, deleteById etc. will be present in Jpa
	 * which enables our project to be connected to Any Database possible
	 */

	User findByEmail(String email);

}

package com.vinext.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByName(String name);
	Optional<User> findByEmail(String email);
	
	boolean existsByName(String name);
	boolean existsByEmail(String email);
}

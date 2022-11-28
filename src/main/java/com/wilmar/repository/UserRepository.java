package com.wilmar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wilmar.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Boolean existsByEmail(String email);

	Boolean existsByPhone(String phone);

	@Query("select count(u.email) > 0 from User u where u.id != :id and u.email = :emailUpdate")
	public boolean isExistEmail(@Param("id") Long id, @Param("emailUpdate") String emailUpdate);

	@Query("select count(u.phone) > 0 from User u where u.id != :id and u.phone = :phoneUpdate")
	public boolean isExistPhone(@Param("id") Long id, @Param("phoneUpdate") String phoneUpdate);
}

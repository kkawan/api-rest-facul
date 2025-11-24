package com.unifil.kawan.api_rest_facul.repository;

import com.unifil.kawan.api_rest_facul.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

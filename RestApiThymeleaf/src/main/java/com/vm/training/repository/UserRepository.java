package com.vm.training.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vm.training.entities.User;

/**
 * 
 * @author sasi chowdary
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{
    Optional<User> findByEmail(String email);
}

package com.vm.training.java.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vm.training.java.rest.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
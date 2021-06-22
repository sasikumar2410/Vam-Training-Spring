package com.vm.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vm.training.entities.Message;


/**
 * 
 * @author sasi chowdary
 *
 */
public interface MessageRepository extends JpaRepository<Message, Integer>{

}

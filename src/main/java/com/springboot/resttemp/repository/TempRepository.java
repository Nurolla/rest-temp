package com.springboot.resttemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.resttemp.model.User;

public interface TempRepository extends JpaRepository<User, Integer> {

}

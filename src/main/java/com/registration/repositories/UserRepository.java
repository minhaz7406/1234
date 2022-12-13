package com.registration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

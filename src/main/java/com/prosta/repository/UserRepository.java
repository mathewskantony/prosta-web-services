package com.prosta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prosta.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername( String username );
}


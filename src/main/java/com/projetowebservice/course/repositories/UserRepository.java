package com.projetowebservice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

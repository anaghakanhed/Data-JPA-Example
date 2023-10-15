package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer>{

}

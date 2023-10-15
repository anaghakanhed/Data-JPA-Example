package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Account;
import com.example.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
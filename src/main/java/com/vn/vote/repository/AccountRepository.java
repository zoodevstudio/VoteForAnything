package com.vn.vote.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vn.vote.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{

	List<Account> findByNameContaining(String q);

	List<Account> findByNameContainingOrUserNameContaining(String q, String q1);
}

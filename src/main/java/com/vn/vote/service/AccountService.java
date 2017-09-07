package com.vn.vote.service;

import java.util.List;

import com.vn.vote.entity.Account;

public interface AccountService {

	List<Account> findAll();

	List<Account> search(String q);

	List<Account> searchKey(String q, String q1);

	Account findOne(int id);

	void save(Account account);

	void delete(int id);
}

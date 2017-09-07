package com.vn.vote.service;

import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.vote.entity.Account;
import com.vn.vote.repository.AccountRepository;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> findAll() {
		return IteratorUtils.toList(accountRepository.findAll().iterator());
	}

	@Override
	public List<Account> search(String q) {
		return accountRepository.findByNameContaining(q);
	}

	@Override
	public List<Account> searchKey(String q, String q1) {
		return accountRepository.findByNameContainingOrUserNameContaining(q, q1);
	}

	@Override
	public Account findOne(int id) {
		return accountRepository.findOne(id);
	}

	@Override
	public void save(Account account) {
		accountRepository.save(account);
	}

	@Override
	public void delete(int id) {
		accountRepository.delete(id);
	}

}

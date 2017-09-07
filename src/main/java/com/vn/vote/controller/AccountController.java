package com.vn.vote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vn.vote.entity.Account;
import com.vn.vote.service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public List<Account> getAccount() {
		return accountService.findAll();
	}

	@RequestMapping(value = "/account/{id}", method = RequestMethod.GET)
	public Account getAccount(@PathVariable("id") int id) {
		return accountService.findOne(id);
	}

	@RequestMapping(value = "/account/search", method = RequestMethod.GET)
	public List<Account> getAccount(@RequestParam("key") String key) {
		return accountService.search(key);
	}

	@RequestMapping(value = "/account/search1", method = RequestMethod.GET)
	public List<Account> getAccountSearch(@RequestParam("key") String key) {
		return accountService.searchKey(key, key);
	}

	@RequestMapping(value = "/account", method = RequestMethod.POST)
	public void saveAccount(@RequestBody Account account) {
		accountService.save(account);
	}
}

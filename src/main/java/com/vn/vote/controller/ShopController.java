package com.vn.vote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vn.vote.entity.Shop;
import com.vn.vote.service.ShopService;

@RestController
@RequestMapping("/api")
public class ShopController {

	@Autowired
	private ShopService shopService;

	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public List<Shop> getShop() {
		return shopService.findAll();
	}

	@RequestMapping(value = "/shop/{id}", method = RequestMethod.GET)
	public Shop getShop(@PathVariable("id") int id) {
		return shopService.findOne(id);
	}

	@RequestMapping(value = "/shop/search/{key}", method = RequestMethod.GET)
	public List<Shop> getShop(@PathVariable("key") String key) {
		return shopService.search(key);
	}

	@RequestMapping(value = "/shop", method = RequestMethod.POST)
	public void saveShop(@RequestBody Shop Shop) {
		shopService.save(Shop);
	}
}

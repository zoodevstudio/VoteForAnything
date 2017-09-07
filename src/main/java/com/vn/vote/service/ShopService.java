package com.vn.vote.service;

import java.util.List;

import com.vn.vote.entity.Shop;

public interface ShopService {

	List<Shop> findAll();

	List<Shop> search(String q);

	Shop findOne(int id);

	void save(Shop shop);

	void delete(int id);
}

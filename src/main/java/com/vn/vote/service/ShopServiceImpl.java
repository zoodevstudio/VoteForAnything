package com.vn.vote.service;

import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vn.vote.entity.Shop;
import com.vn.vote.repository.ShopRepository;

@Service("shopService")
public class ShopServiceImpl implements ShopService {

	@Autowired
	private ShopRepository shopRepository;

	@SuppressWarnings("unchecked")
	@Override
	public List<Shop> findAll() {
		return IteratorUtils.toList(shopRepository.findAll().iterator());
	}

	@Override
	public List<Shop> search(String q) {
		return shopRepository.findByNameContaining(q);
	}

	@Override
	public Shop findOne(int id) {
		return shopRepository.findOne(id);
	}

	@Override
	public void save(Shop shop) {
		shopRepository.save(shop);
	}

	@Override
	public void delete(int id) {
		shopRepository.delete(id);
	}
}

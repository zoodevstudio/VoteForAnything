package com.vn.vote.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vn.vote.entity.Shop;

public interface ShopRepository extends CrudRepository<Shop, Integer> {

	List<Shop> findByNameContaining(String q);
}

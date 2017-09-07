package com.vn.vote.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the shop database table.
 *
 */
@Entity
@Table(name = "shop")
public class Shop implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "SHOP_ID", unique = true, nullable = false)
	private int shopId;

	@Column(length = 30)
	private String address;

	@Column(length = 20)
	private String city;

	private int count;

	@Column(length = 2083)
	private String description;

	private int distance;

	@Column(length = 2083)
	private String link;

	@Column(length = 16)
	private String phone;

	@Column(length = 10)
	private String price;

	@Column(name = "NAME", length = 255)
	private String name;

	@Column(length = 20)
	private String state;

	public Shop() {
	}

	public int getShopId() {
		return this.shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDistance() {
		return this.distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", address=" + address + ", city=" + city + ", count=" + count
				+ ", description=" + description + ", distance=" + distance + ", link=" + link + ", phone=" + phone
				+ ", price=" + price + ", Name=" + name + ", state=" + state + ", toString()="
				+ super.toString() + "]";
	}

}
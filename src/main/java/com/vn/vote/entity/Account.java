package com.vn.vote.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ACCOUNT_ID", unique = true, nullable = false)
	private int accountId;

	@Column(length = 255)
	private String avatar;

	@Column(name = "NAME", length = 20)
	private String name;

	@Column(name = "PASS_WORD", length = 20)
	private String passWord;

	@Column(length = 10)
	private String status;

	@Column(name = "USER_NAME", length = 20)
	private String userName;

	public Account() {
	}

	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", avatar=" + avatar + ", Name=" + name + ", passWord=" + passWord
				+ ", status=" + status + ", userName=" + userName + ", toString()=" + super.toString() + "]";
	}
}
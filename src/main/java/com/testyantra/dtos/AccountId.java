package com.testyantra.dtos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//no need of entity as we are merging all these details into same table
@SuppressWarnings("serial")
@Embeddable //always used on top of class
//serialize embeddable class in case of generating composite key using embeddedId
public class AccountId implements Serializable{
	@Column(name="account_id")
	private int accountId;
	@Column(name="account_type")
	private String accountType;

	public AccountId(int accountId, String accountType) {
		this.accountId = accountId;
		this.accountType = accountType;
	}

	public AccountId() {
		
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "AccountId [accountId=" + accountId + ", accountType=" + accountType + "]";
	}

	
	
	
	
	
	
	
	
	
}

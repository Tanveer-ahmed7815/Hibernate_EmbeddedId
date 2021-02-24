package com.testyantra.dtos;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="accountinformation")
public class AccountInformation  {
	@EmbeddedId
	private AccountId accountId;
	@Column(name="account_holder_name")
	private String accountHolderName;
	
	public AccountInformation(AccountId accountId, String accountHolderName) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
	}
	
	public AccountInformation() {
		
	}
	
	public AccountId getAccountId() {
		return accountId;
	}
	public void setAccountId(AccountId accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	@Override
	public String toString() {
		return "AccountInformation [accountId=" + accountId + ", accountHolderName=" + accountHolderName + "]";
	}
	
	
	
	

	
	
	
}

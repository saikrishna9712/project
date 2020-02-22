package com.capg.onlinewallet.dao;

import com.capg.onlinewallet.model.WalletAccount;

public interface WalletAccountDao {
	public boolean addAmount(long id,double amount);
	public double showBalance(long id);

}

package com.capg.onlinewallet.service;

import com.capg.onlinewallet.model.WalletAccount;

public interface WalletAccountService {
	public boolean addAmount(long id,float amount) throws Invalidid,Invalidamount;
	public double showBalance(long id) throws Invalidid;


}

package com.capg.onlinewallet.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capg.onlinewallet.model.WalletAccount;

public class WalletAccountDaoImpl implements WalletAccountDao {
	Scanner in=new Scanner(System.in);
	public static Map<Long, WalletAccount> walletAccounts=new HashMap<Long, WalletAccount>();
	public WalletAccountDaoImpl() {
		addSomeWalletAccount();
	}
	public void addSomeWalletAccount() {
		
		WalletAccount ac1=new WalletAccount(100101102103L,2000.0,"ravi");
		WalletAccount ac2=new WalletAccount(100101102104L,3000,"Mahesh");
		
	
		
		walletAccounts.put(ac1.getWalletId(), ac1);
		walletAccounts.put(ac2.getWalletId(), ac2);
	}
	
	
	

	public boolean addAmount(long id, double amount) {
		// TODO Auto-generated method stub
		if(!walletAccounts.containsKey(id)) {
			return false;
		}
		else {
		WalletAccount acc=walletAccounts.get(id);
		acc.setBalance(acc.getBalance()+amount);
				return true;
		}
		
	}

	public double showBalance(long id) {
		// TODO Auto-generated method stub
		return walletAccounts.get(id).getBalance();

}
	public Map<Long, WalletAccount> getWalletAccounts() {
		// TODO Auto-generated method stub
		return null;
	}
}

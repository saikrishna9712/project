package com.capg.onlinewallet.service;

import com.capg.onlinewallet.dao.WalletAccountDao;
import com.capg.onlinewallet.dao.WalletAccountDaoImpl;

public class WalletAccountServiceImpl implements WalletAccountService{
	
	WalletAccountDao walletDao=new WalletAccountDaoImpl();

	public boolean addAmount(long id, float amount) throws Invalidid,Invalidamount {
		// TODO Auto-generated method stub
		if(id<100101102103L) {
   		 throw new Invalidid("Invalid Id Entered");
   	 }
		if(amount<0 || amount>=50000) {
			throw new Invalidamount("In-valid amount Entered");
		}
	
		return walletDao.addAmount(id,amount);
			}
			
		
     public double showBalance(long id) throws Invalidid{
		// TODO Auto-generated method stub
    	 if(id<100101102103L) {
    		 throw new Invalidid("Invalid Id Entered");
    	 }
		  return walletDao.showBalance(id);
			
	}

}


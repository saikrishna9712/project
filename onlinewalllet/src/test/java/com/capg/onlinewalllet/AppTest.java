package com.capg.onlinewalllet;

import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.onlinewallet.dao.WalletAccountDaoImpl;
import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.service.Invalidamount;
import com.capg.onlinewallet.service.Invalidid;
import com.capg.onlinewallet.service.WalletAccountService;
import com.capg.onlinewallet.service.WalletAccountServiceImpl;


public class AppTest{
	WalletAccountService service=new WalletAccountServiceImpl();
	static WalletAccountDaoImpl dao=new WalletAccountDaoImpl();
	static Map<Long,WalletAccount> walletAccounts=WalletAccountDaoImpl.walletAccounts;
	static WalletAccount ac1;
    
@BeforeAll
public static void addSomeWalletAccount() {
	
	 ac1=new WalletAccount(100101102103L,2000.0,"ravi");
	
	walletAccounts.put(ac1.getWalletId(), ac1);
	
}

//checking for show balance
  @Test

public void testshowBalance() throws Invalidid{
	  double balance=service.showBalance(100101102103L);
	  assertEquals(ac1.getBalance(),balance);
}
  
  //checking for invalid amount Exception
 
@Test
public void testInvalidamountException() {
	assertThrows(Invalidamount.class,()->{
		service.addAmount(100101102103L,-1000);
	});
}

}
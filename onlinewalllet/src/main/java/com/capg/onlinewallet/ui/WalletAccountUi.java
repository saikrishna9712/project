package com.capg.onlinewallet.ui;

import java.util.Scanner;

import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.service.Invalidamount;
import com.capg.onlinewallet.service.Invalidid;
import com.capg.onlinewallet.service.WalletAccountService;
import com.capg.onlinewallet.service.WalletAccountServiceImpl;

public class WalletAccountUi {
	
	static WalletAccountService walletService=new WalletAccountServiceImpl();
	
	static Scanner in= new Scanner(System.in);

	public static void main(String[] args)    {
		// TODO Auto-generated method stub
		for(;;) {
			int choice;
			System.out.println("Enter your choice : ");
			System.out.println("1 - add amount");
			System.out.println("2 - show balance");
			System.out.println("3 - Exit");
			
			choice=in.nextInt();
			switch (choice) {
			case 1:
				getaddAmount();
				
				break;
			case 2:
				showBalance();
				
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			
			}
			
		}

	private static void showBalance() {
		// TODO Auto-generated method stub
		System.out.println("Enter wallet id :");
		long id=in.nextLong();
		try {
				double acc = walletService.showBalance(id);
				System.out.println(acc);
				
			}
		catch(Invalidid ex){
			System.out.println("error " +ex.getMessage());
			
		}
	  
	}

	private static void getaddAmount() {
		// TODO Auto-generated method stub
		System.out.println("Enter wallet id :");
		long id=in.nextLong();
		System.out.println("Enter Amount ");
        float amount=in.nextFloat();
		
		try {
			
			if(walletService.addAmount(id,amount)) {
			System.out.println("Amount added Successfully");
		}
		}
		catch(Invalidid ex){
			System.out.println("error " +ex.getMessage());
			
		}
		catch(Invalidamount ex){
			System.out.println("error " +ex.getMessage());
			
		}
		
		}
		
				
	}


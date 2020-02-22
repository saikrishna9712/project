package com.capg.onlinewallet.model;

public class WalletAccount {
 
private long walletId;
 private double balance;
 private String name;
public long getWalletId() {
	return walletId;
}
public void setWalletId(long walletId) {
	this.walletId = walletId;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public WalletAccount(long walletId, double balance, String name) {
	super();
	this.walletId = walletId;
	this.balance = balance;
	this.name = name;
}
@Override
public String toString() {
	return "WalletAccount [walletId=" + walletId + ", balance=" + balance + ", name=" + name + "]";
}
 
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(balance);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + (int) (walletId ^ (walletId >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	WalletAccount other = (WalletAccount) obj;
	if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (walletId != other.walletId)
		return false;
	return true;
}


}

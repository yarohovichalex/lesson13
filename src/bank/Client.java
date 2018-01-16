/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Arrays;

/**
 *
 * @author Алексей
 */
public class Client {
    private String name;
    private String surname;
    private Account [] accounts;
   // private Account account;
    //private AccountType at;
    public Client(String name, String surname){
        this.name = name;
        this.surname = surname;
        Account [] accounts = new Account[0];        
    }
    
    public void createAccount(String accountTypeStr, int accumulation){
    	if(accounts == null) {
    		this.accounts = new Account[1];
            this.accounts[accounts.length-1] = new Account();            
            accounts[accounts.length-1].setAt(AccountType.valueOf(accountTypeStr));
            accounts[accounts.length-1].setId(Account.getUseId());
            accounts[accounts.length-1].setAccumulation(accumulation);
            System.out.println(accountTypeStr);
    	}else if(accounts[accounts.length-1].isBlocked() == false) {
    		Account [] oldAcc = this.accounts;
    		this.accounts = new Account[accounts.length+1];
    		this.accounts = Arrays.copyOf(oldAcc, accounts.length);
            this.accounts[accounts.length-1] = new Account();            
            accounts[accounts.length-1].setAt(AccountType.valueOf(accountTypeStr));
            accounts[accounts.length-1].setId(Account.getUseId()); 
            accounts[accounts.length-1].setAccumulation(accumulation);
            System.out.println(accountTypeStr);
    	}else {
    		System.out.println("data is not correct or account is blocked!");
    	}       
    }
    public void blockedAccount(int id){
    	if(accounts[id] == null) {
    		System.out.println("entered the wrong account id");
    	}else {
    		this.accounts[id].setBlocked(true);
    	}    	
    }
    public void accountSearch(String type) {
    	if(accounts == null) {
    		System.out.println("the customer does not have an account, sor)");
    	}else {
    		for (int i = 0; i < accounts.length; i++) {
    			if(this.accounts[i] == null) {
    				System.out.println("accounts[i] = null");
    			}else if(this.accounts[i].getStringAt().contains(type)) {
    				System.out.println("found a similar account: " + this.accounts[i]);    				
    			}else {
    				//System.out.println("nothing");
    			}
    		}    		
    	}    	
    }
    public void sortByAmount() {
    	if(this.accounts == null) {
    		System.out.println("the customer does not have an account");
    	}else {
    		for (int i = 0; i < this.accounts.length; i++) {
    			if(this.accounts[0] == null) {
    				System.out.println("there is no first element of the array");
    			}else {
    				for (int j = 0; j < this.accounts.length; j++) {    					
        				if(this.accounts[j] == null) {
            				System.out.println("there is no element of the array");
        				}else if(this.accounts[i].getAccumulation() < this.accounts[j].getAccumulation()) {
            				Account tmp = this.accounts[i];
        					this.accounts[i] = this.accounts[j];
        					this.accounts[j] = tmp;
        				}
    				}
    			}    			
    		}
    	}    	
    }
    public int calculationOfTheAmountByAccounts() {
    	int sum = 0;
    	if(this.accounts == null) {
    		System.out.println("the customer does not have an account");
    	}
    	for (int i = 0; i < accounts.length; i++) {
			if(this.accounts[i] == null) {
				System.out.println("there is no element of the array");
			}else {
				sum += this.accounts[i].getAccumulation();
			}
		}
    	return sum;
    }
}

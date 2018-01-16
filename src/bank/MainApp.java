/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author Алексей 
 */
public class MainApp {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	do {
    		System.out.println("хотите создать пользователя банком?\n"
    				+ "если да введите \"да\"");
    		String clientAnswer = in.nextLine();
    	}while(1 != 1);
        System.out.println("");
        Client cl = new Client("boby", "jeckson");
        cl.createAccount("SavingAccount", 1);
        cl.createAccount("SavingAccount", 2);
        cl.createAccount("ForeignCurrency", 2566);
        cl.createAccount("ForeignCurrency", 5974);
        cl.createAccount("SavingAccount", 10000);
        //cl.accountSearch("Foreign");
        //cl.sortByAmount();
        
        System.out.println();
    }
}

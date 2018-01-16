/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Алексей
 */
public class Account {
    private boolean blocked = false;
    private int accumulation;
    private static int countId;
    private int id;
    private AccountType at;

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public int getAccumulation() {
        return accumulation;
    }

    public void setAccumulation(int accumulation) {
        this.accumulation += accumulation; //+?
    }

    public static int getUseId() {
    	setUseId(++countId);
        return countId;
    }

    public static void setUseId(int useId) {
        Account.countId = useId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AccountType getAt() {
        return at;
    }
    
    public String getStringAt() {    	
        return this.at.toString();
    }

    @Override
	public String toString() {
		return "Account [blocked=" + blocked + ", accumulation=" + accumulation + ", id=" + id + ", type=" + at + "]";
	}

	public void setAt(AccountType at) {
        this.at = at;
    }
    
}

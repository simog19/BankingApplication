package banksystem;

import exceptions.InsufficientFundsException;


public class CheckingS2023Team1 extends AccountS2023Team1 {
	private String type;
	
	public  CheckingS2023Team1() {

	}
	
	public CheckingS2023Team1(int ownerId, int accountNumber, String routingNumber) {
		super(ownerId, accountNumber, routingNumber);
		setType();
	}

	//do checks on money availability and printing status of operation
	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		
		System.out.println("Account n." + this.getAccountNumber()  + " - Withdraw ongoing... Current balance: $" + this.getBalance() + " - Amount to wihtdraw: $" + amount);
		
			
			if (this.getBalance() <= 0.0) {
				System.out.println("!!!! Insufficent Funds !!!! You cannot withdraw any amount of money.");
				throw new InsufficientFundsException(amount); 
			}
			
			else if ((this.getBalance() - amount) < 0.0) {
				System.out.println("!!!! Insufficent Funds !!!! You can withdraw at most: $" + this.getBalance());
				throw new InsufficientFundsException(amount); 
			}
			
			else {
			
				this.setBalance(this.getBalance() - amount);
			
				System.out.println("Withdraw of $" + amount + " executed. New Balance: $" + this.getBalance());
			}
			
		}


	public String getType() {
		return type;
	}


	public void setType() {
		type = "CheckingAccount";
	}
	
	@Override
	public String toString() {
		return "[OwnerID=" + super.getOwnerID() + "Account_ID=" + getAccountNumber()  + "type=" + type + ", getRouting_number()=" + getRouting_number() + ", getBalance()="
				+ getBalance() + "]";
	}

}

		

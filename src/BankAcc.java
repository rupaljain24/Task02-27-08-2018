
public class BankAcc {

	private int accno;
	private String acname;
	private double balance;
	private String accType;
	private static double deposit=0;
	private static double withdrawl=0;

 public BankAcc(int accno,String acname,double balance,String accType)
 {
	 this.accno=accno;
	 this.acname=acname;
	 this.balance=balance;
	 this.accType=accType;
	 
 }

public int getAccno() {
	return accno;
}

public void setAccno(int accno) {
	this.accno = accno;
}

public String getAcname() {
	return acname;
}

public void setAcname(String acname) {
	this.acname = acname;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public String getAccType() {
	return accType;
}

public void setAccType(String accType) {
	this.accType = accType;
}

public void showDetails()
{
	
		System.out.println(accno+" "+ acname+" "+ balance+" "+accType);
}

	public void withdrawMoney(double bal) {
		
		this.balance = this.balance - bal;
		System.out.println("Current Balance  of" + this.acname + " after withdrawl of Rs."+bal+"=" + balance);
		withdrawl=withdrawl+bal;

	}

	public void depositMoney(double bal) {
		this.balance = this.balance + bal;
		double moneydeposit=bal;
		System.out.println("Current Balance of " + this.acname + " after Deposit of Rs."+bal+"="+balance);
		deposit=deposit+bal;

	}


	
	public static void computeAvg(BankAcc... obj) {
		double total = 0;
		for (BankAcc avg : obj) {
			total = total + avg.balance;
		}
		System.out.println("Average Balance=" + total / obj.length);
	}

	public void transactionAmount() {
		System.out.println("Total Transaction Amount");
		System.out.println("______________________________");
		System.out.println("Total Deposit Amount=" + deposit);
		System.out.println("Total withdrwal Amount=" +withdrawl);
}
	

	public static void main(String[] ar) {
		BankAcc account1 = new BankAcc(101, "John", 7000, "Current Account");
		BankAcc account2 = new BankAcc(102, "JAck", 9000, "Saving Account");
		BankAcc account3 = new BankAcc(103, "Rachel", 10000, "Current Account");
		BankAcc account4 = new BankAcc(104, "Monica", 5000, "Saving Account");

		System.out.println("Total Customers");
		System.out.println("...........................................................................");

		account1.showDetails();
		account2.showDetails();
		account3.showDetails();
		account4.showDetails();

		System.out.println("...........................................................................");
		account1.withdrawMoney(500);
		//account1.showDetails();
		
		account1.depositMoney(1000);
		//account1.showDetails();
		
		System.out.println("...........................................................................");
		computeAvg(account1, account2, account3);

		System.out.println("...........................................................................");
	
		
     	account1.transactionAmount();
	}
	


}

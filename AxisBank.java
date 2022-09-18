package Week3.day1;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("Axis Bank Deposit");
	}
	public static void main(String[] args) {
		AxisBank dep1 = new AxisBank();
		dep1.deposit(2);
		dep1.deposit();
		
	}
}

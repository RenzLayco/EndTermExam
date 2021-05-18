

public class AccountUnitTest
{
	public static void main(String[] args)
	{
		Account[] accountArray = new Account[10];
		
		accountArray[0] = new Checking(8);
		accountArray[1] = new Checking(11);
		accountArray[2] = new Checking(12);
		accountArray[3] = new Checking(16);
		accountArray[4] = new Checking(19);
		accountArray[5] = new Savings(2123, 0.5);
		accountArray[6] = new Savings(2244, 1.5);
		accountArray[7] = new Savings(2312, 2.2);
		accountArray[8] = new Savings(2487, 3.1);
		accountArray[9] = new Savings(2533, 4.3);
		
		
		for(int i = 0; i < accountArray.length; ++i)
			System.out.println(accountArray[i].getAccountInfo() + "\n");
	}
}

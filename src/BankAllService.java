import java.util.HashMap;
import java.util.Scanner;

public class BankAllService {
	Scanner scan = new Scanner(System.in);
	////Account Details
	public void accountDetailsEntry(int accountNumber, HashMap<Integer, AccountDetails> hm) {
		System.out.println("\n\nWelcome To Account Details Entry Service....");
        System.out.println("Enter Account Details");
        System.out.print("Enter Name = ");
        String accountHolderName = scan.nextLine();

        System.out.print("Enter Mobile No = ");
        String accountHolderMobileNo = scan.nextLine();


        System.out.print("Enter Account Balance = ");
        int accountBalance = scan.nextInt();
        System.out.println("--------------------------------------");
        scan.nextLine();
        
        AccountDetails accountHolderDetails = new AccountDetails(accountHolderName,accountHolderMobileNo,accountBalance);

        hm.put(accountNumber,accountHolderDetails);
        hm.forEach((i,j)->System.out.println(i+", "+j));
	}
	//Deposit Service
	public void depositAmount(HashMap<Integer, AccountDetails> hm) {
		System.out.println("\n\nWelcome To Deposit Service....");
        System.out.print("Please Enter your Account Number = ");
        int accountNumberCheck = scan.nextInt();
        if(hm.containsKey(accountNumberCheck)){
            System.out.print("Please Enter Deposit Amount ");
            int depositAmount = scan.nextInt();
            scan.nextLine();
            int currentBalance =hm.get(accountNumberCheck).accountBalance;


            AccountDetails modifiedValues = new AccountDetails(hm.get(accountNumberCheck).accountHolderName,hm.get(accountNumberCheck).accountHolderMobileNo,(currentBalance+depositAmount));
            hm.put(accountNumberCheck,modifiedValues);
            System.out.println("Your Account Balance is = "+hm.get(accountNumberCheck).accountBalance);
        }
        else{
            System.out.print("Please enter your valid account Number ");
        }
	}
	//Withdraws Service
	public void withdrawsAmount(HashMap<Integer, AccountDetails> hm) {
		System.out.println("\n\nWelcome To withdraws Service....");
        System.out.print("Please Enter your Account Number = ");
        int accountNumberCheck = scan.nextInt();
        if(hm.containsKey(accountNumberCheck)){
            System.out.print("Please Enter withdraws Amount ");
            int withdrawsAmount = scan.nextInt();
            scan.nextLine();
            int currentBalance = hm.get(accountNumberCheck).accountBalance;
            if(currentBalance >= withdrawsAmount){
            	 AccountDetails modifiedValues = new AccountDetails(hm.get(accountNumberCheck).accountHolderName,hm.get(accountNumberCheck).accountHolderMobileNo,(currentBalance-withdrawsAmount));
                 hm.put(accountNumberCheck,modifiedValues);
                 System.out.println("withdraws success please collect your Amount");
                System.out.println("Your current Account Balance is = "+hm.get(accountNumberCheck).accountBalance);
            }
            else {
            	System.out.print("Insufficient balance... ");
            }
        }
        else{
            System.out.print("Please enter your valid account Number ");
        }
	}
	//Bilence Check Service
	public void balanceCheck(HashMap<Integer, AccountDetails> hm) {
		System.out.println("\n\nWelcome To Balance check Service....");
        System.out.print("Please Enter your Account Number = ");
        int accountNumberCheck = scan.nextInt();
        scan.nextLine();
        if(hm.containsKey(accountNumberCheck)){
            
            int currentBalance = hm.get(accountNumberCheck).accountBalance;
            System.out.println("Your Account Holder Name = "+hm.get(accountNumberCheck).accountHolderName);
            System.out.println("Your Account Holder MobileNo = "+hm.get(accountNumberCheck).accountHolderMobileNo);
            System.out.println("Your Account Balance is = "+currentBalance);
        }
        else{
            System.out.print("Please enter your valid account Number ");
        }
	}
}

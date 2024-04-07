import java.util.HashMap;
import java.util.Scanner;
public class Bank {
    static Scanner scan = new Scanner(System.in);
    
    public int askEntry() {
        System.out.println("\n\nEnter Customer Details press = 1");
        System.out.println("Deposit press = 2");
        System.out.println("withdraws press = 3");
        System.out.println("View Balance press = 4");
        System.out.println("Exit press = 5");
        System.out.println("--------------------------");
        System.out.print("Please Enter your choice = ");
        int choice = scan.nextInt();
        return choice;
    }
    public static void main(String[] args) {
    	
        Bank bank = new Bank();
        BankAllService bac = new BankAllService();
        int accountNumber = 22220;
        HashMap<Integer, AccountDetails> hm = new HashMap<>();
        while(true){
          int select =   bank.askEntry();
            switch(select){
            	//Account Details
                case 1:{
                	++accountNumber;
                	bac.accountDetailsEntry(accountNumber, hm);
                    break;

                }
                //Deposit Amount
                case 2:{
                	bac.depositAmount(hm);
                    break;
                }
                //withdraws Amount
                case 3:{
                	bac.withdrawsAmount(hm);
                    break;
                }
                // check Balance
                case 4:{
                	 bac.balanceCheck(hm);
                     break;
                }
                // Exit
                case 5:{
                	System.out.print("Thank You for using xyz Bank Service....");
                	System.exit(0);
                }
            }
        }
    }
//    public boolean accountValidation( int accountNumberCheck){
//        boolean status = false;
//        if(hm.containsKey(accountNumberCheck)){
//            status = true;
//        }
//        return status;
//    }
}


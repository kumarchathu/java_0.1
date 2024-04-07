public class AccountDetails {
	    String accountHolderName;
	    String accountHolderMobileNo;
	    int accountBalance;

	    public AccountDetails(String accountHolderName, String accountHolderMobileNo, int accountBalance) {
	        this.accountHolderName = accountHolderName;
	        this.accountHolderMobileNo = accountHolderMobileNo;
	        this.accountBalance = accountBalance;
	    }

	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    public void setAccountHolderName(String accountHolderName) {
	        this.accountHolderName = accountHolderName;
	    }

	    public String getAccountHolderMobileNo() {
	        return accountHolderMobileNo;
	    }

	    public void setAccountHolderMobileNo(String accountHolderMobileNo) {
	        this.accountHolderMobileNo = accountHolderMobileNo;
	    }

	    public int getAccountBalance() {
	        return accountBalance;
	    }

	    public void setAccountBalance(int accountBalance) {
	        this.accountBalance = accountBalance;
	    }

	    @Override
	    public String toString() {
	        return "AccountDetails{" +
	                "accountHolderName='" + accountHolderName + '\'' +
	                ", accountHolderMobileNo='" + accountHolderMobileNo + '\'' +
	                ", accountBalance=" + accountBalance +
	                '}';
	    }
	}

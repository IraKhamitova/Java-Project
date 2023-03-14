package methods;

public class BankAccount {

    String accountNumber;
    String accountHolderName;
    double Balance;

    public boolean dailyWithdraw(double amount) {
        return false;


    }


    public void deposit(double amount) {

    }

    public boolean withdraw(double amount) {

        return false;


    }


    public void setAccountNumber(String accountNumber) {    //  "89632145"
        boolean isValidAccountNumber = true;

        if (accountNumber.length() == 8) {
            for (int i = 0; i < 8; i++) {
                if (!Character.isDigit(accountNumber.charAt(i))) {
                    System.out.println("WARNING: The account number must only contain digits.");
                    isValidAccountNumber = false;
                    break;
                }
            }
        } else {
            System.out.println("WARNING: The length of account number must be 8");
            isValidAccountNumber = false;
        }
        //Log message - is a message of developer for developer/user, which tells what is going on in the application

        if (isValidAccountNumber) {
            System.out.println("SUCCESSFUL, account number is valid.");
            this.accountNumber = accountNumber;
        } else {
            System.out.println("FAILURE: The provided account number is not valid");
        }
    }




    }





package week4;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private String password;
    private String accountType;
    private String routingNumber;
    private String bankName;
    private double balance;

    public BankAccount() {
        this.accountHolderName = "Default Name";
        this.accountNumber = "00000000";
    }

    public BankAccount(String accountOpenersName) {
        this();
        this.accountHolderName = accountOpenersName;
    }

//    public BankAccount(String bankName) {
//        this();
//        this.bankName = bankName;
//    }

    public BankAccount(double balance) {
        this();
        this.balance = balance;
    }

    public String toString() {
        String mySuper = super.toString();
        return mySuper
                + "\nBankAccount: "
                + accountNumber
                + "\nbalance: "
                + balance
                + "\naccountHolderName: "
                + accountHolderName
                + '\n';
    }

    public BankAccount(String accountNumber, String accountHolderName, String password, String accountType, String routingNumber, String bankName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.password = password;
        this.accountType = accountType;
        this.routingNumber = routingNumber;
        this.bankName = bankName;
        this.balance = balance;
    }

    public static void main(String [] args) {
        BankAccount first = new BankAccount();
        System.out.println(first);
        BankAccount second = new BankAccount("John Doe");
        System.out.println(second);
//        System.out.println(second.accountNumber);
        BankAccount third = new BankAccount(1000.0);
        System.out.println(third);
    }

}

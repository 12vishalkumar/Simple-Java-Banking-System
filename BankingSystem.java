//***************************** Importing required libararies ****************************
import java.util.HashMap;
import java.util.Map;


//****************************** Bank class **********************************************
class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(String accountNumber, String customerName, double balance) {
        Account account = new Account(accountNumber, customerName, balance);
        accounts.put(accountNumber, account);
    }

    public void displayAccountInfo(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Customer Name: " + account.getCustomerName());
            System.out.println("Balance: $" + account.getBalance());
        } else {
            System.out.println("Account number " + accountNumber + " not found!");
        }
    }

    public void performTransaction(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.deposit(amount);
            System.out.println("Transaction successful. Updated balance: $" + account.getBalance());
        } else {
            System.out.println("Account number " + accountNumber + " not found!");
        }
    }
}

//************************************* Account class ********************************
class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

//***************************** BankingSystem class ********************************
public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        //********************** Adding a few accounts *****************************
        bank.addAccount("101", "Vishal Kumar", 3000.0);
        bank.addAccount("102", "Ishika", 530.0);
        bank.addAccount("103", "Rahul Yedav", 5200.0);
        bank.addAccount("104", "Sagar", 4100.0);
        bank.addAccount("105", "Anchal", 5020.0);
        bank.addAccount("106", "Kajal Kumari", 1300.0);
        bank.addAccount("107", "Manish Kumar", 3140.0);
        bank.addAccount("108", "Vikash Yedav", 6310.0);
        bank.addAccount("109", "Shailendra", 5700.0);
        bank.addAccount("110", "Jane Smith", 2900.0);


        //********************** Performing transactions ****************************
        bank.performTransaction("101", 1300.0);
        bank.performTransaction("102", 8000.0);
        bank.performTransaction("103", 2000.0);
        bank.performTransaction("104", 500.0);
        bank.performTransaction("105", 520.0);
        bank.performTransaction("106", 460.0);
        bank.performTransaction("107", 900.0);
        bank.performTransaction("108", 560.0);
        bank.performTransaction("109", 820.0);
        bank.performTransaction("110", 600.0);
        bank.performTransaction("201", 490.0);
        bank.performTransaction("143", 800.0);
        bank.performTransaction("111", 390.0);
        bank.performTransaction("203", 810.0);

        //*********************** Displaying account information ********************
        bank.displayAccountInfo("101");
        bank.displayAccountInfo("102");
        bank.displayAccountInfo("103");
        bank.displayAccountInfo("104");
        bank.displayAccountInfo("105");
        bank.displayAccountInfo("106");
        bank.displayAccountInfo("107");
        bank.displayAccountInfo("108");
        bank.displayAccountInfo("109");
        bank.displayAccountInfo("110");
    }
}
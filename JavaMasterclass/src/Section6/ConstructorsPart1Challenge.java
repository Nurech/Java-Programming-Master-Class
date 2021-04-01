package Section6;

public class ConstructorsPart1Challenge {

    public static void main(String[] args) {
       Account bobsAccount = new Account(); // were calling instructor, were creating it
       bobsAccount.setNumber("12345"); // this is a lot of setting the initial value. Lets add an constructor instead.
       bobsAccount.setBalance(0);
       bobsAccount.setCustomerName("Bob Marley");
       bobsAccount.setCustomerEmailAddress("bob@marley.com");
       bobsAccount.setCustomerPhoneNumber("12354670");
       bobsAccount.withdrawal(100.0);
       bobsAccount.deposit( 50);
       bobsAccount.withdrawal(100);
       bobsAccount.deposit(51);
       bobsAccount.withdrawal(100);

       // instead of the above, lets use constructor overloading and lets call Account with parameters
        Account bobbyAccount = new Account("12345", 0.00, "Bob Bobby", "bobby@com.com", "3214151");
        bobbyAccount.deposit(100);
        bobbyAccount.withdrawal(50);
        System.out.println(bobbyAccount.getBalance());
        System.out.println(bobsAccount.getBalance());;

        //now if we run this, were going to get new Account Default value.
        Account defaultAccount = new Account();

        //noinspection SpellCheckingInspection
        Account timsAccount = new Account("Tim", "tim@gmail.com", "1234535");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName() + timsAccount.getCustomerEmailAddress());

        //challenge VipCustomer

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getVipCustomerName());
        VipCustomer person2 = new VipCustomer("Bob", 2500.00);
        System.out.println(person2.getVipCustomerName());
        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@tim.com");
        System.out.println(person3.getVipCustomerName());

    }

    public static class VipCustomer {
        private String vipCustomerName;
        private double creditLimit;
        private String vipCustomerEmailAddress;

        //first constructor
        public VipCustomer() {
            this("Default name", 50000.00, "default@email.com");
        }
        // second constructor
        public VipCustomer(String vipCustomerName, double creditLimit) {
            this(vipCustomerName, creditLimit, "unknown@email.com");
        }

        //third constructor
        public VipCustomer(String vipCustomerName, double creditLimit, String vipCustomerEmailAddress) {
                this.vipCustomerName = vipCustomerName;
                this.creditLimit = creditLimit;
                this.vipCustomerEmailAddress = vipCustomerEmailAddress;
        }

        public String getVipCustomerName() {
            return vipCustomerName;
        }

        public double getCreditLimit() {
            return creditLimit;
        }

        public String getVipCustomerEmailAddress() {
            return vipCustomerEmailAddress;
        }
    }
    
    public static class Account {
        private String number;
        private double balance;
        private String customerName;
        private String customerEmailAddress;
        private String customerPhoneNumber;

        //1st constructor
        public Account(){
            //we can have constructors in constructors. Special case this must be first.
            //lets say we called an empty constructor, but if that's the case then lets assign is some initial values?
            this("213321", 2.50, "Default name", "Default address", "default phone");
            // so when were first running, we can call it. just like we can overload methods, we can overload constructors
            System.out.println("Empty constructor called");
        }
// 2nd constructor
        public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
            System.out.println("Account constructor with default parameters called");
            this.number = number;
            this.balance = balance;
            this.customerName = customerName;
            this.customerEmailAddress = customerEmailAddress;
            this.customerPhoneNumber = customerPhoneNumber;
        }
//3rd constructor
        public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
            this("999999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
            this.customerName = customerName;
            this.customerEmailAddress = customerEmailAddress;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        public void deposit(double depositAmount){
            this.balance += depositAmount;
            System.out.println("Deposit of " + depositAmount + " made to: " + customerName +" New Balance: " + this.balance);
        }

        public void withdrawal(double withdrawalAmount){
            if (balance - withdrawalAmount < 0){
                System.out.println("Only " + this.balance + " available on " + customerName + "'s account. Withdrawal not processed.");
            } else {
                balance -= withdrawalAmount;
                System.out.println("Withdrawal of " + withdrawalAmount + " processed from " + customerName +". Remaining balance: " + this.balance);
            }
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerEmailAddress() {
            return customerEmailAddress;
        }

        public void setCustomerEmailAddress(String customerEmailAddress) {
            this.customerEmailAddress = customerEmailAddress;
        }

        public String getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }

        public void setCustomerPhoneNumber(String customerPhoneNumber) {
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}

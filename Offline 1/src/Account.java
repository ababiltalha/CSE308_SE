public abstract class Account {
    private String name;
    private String type;
    private int accountAge;
    private double currentBalance;
    private double loanAmount;
    private double requestedAmount;
    private boolean loanRequest, loanApproval;
    private static double loanInterestRate= 0.10;
    private static final double serviceCharge= 500;

    protected Account(String name, String type, double currentBalance, double loanAmount){
        this.name= name;
        this.type= type;
        this.currentBalance= currentBalance;
        this.loanAmount= loanAmount;
        this.requestedAmount= this.accountAge= 0;
        this.loanApproval= this.loanRequest= false;
        System.out.println((type)+" account for "+name+" created; initial balance "+currentBalance+"$.");
    }

    public static double getLoanInterestRate() {
        return loanInterestRate;
    }
    public static double getServiceCharge() {
        return serviceCharge;
    }

    public abstract double updateBalance();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void requestLoan(double amount);
//    public abstract void updateRate(double newRate);

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }


    public boolean isLoanApproval(){
        return loanApproval;
    }

    public void setLoanRequest(double amount) {
        this.requestedAmount= amount;
        this.loanRequest = true;
    }

    public boolean isLoanRequest(){
        return loanRequest;
    }

    public void setLoanApproval(double amount) {
        if(this.loanRequest) {
            this.loanApproval = true;
            this.loanRequest = false;
            requestLoan(amount);
        }
        else this.loanApproval= false;
    }

    public void getLoan(double amount){ //fund related calc done
        this.loanAmount= amount;
        this.currentBalance+= amount;
        Bank.setInternalFund(Bank.getInternalFund()-amount);
    }

    public void queryDeposit(){
        System.out.print("Current Balance "+currentBalance+"$");
        if(loanAmount!=0)   System.out.print(", loan "+loanAmount+"$");
        System.out.println();
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }

    public void incrementClock() {
        accountAge++;
    }

    public int getAccountAge() {
        return accountAge;
    }
}

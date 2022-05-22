public class AccSavings extends Account {
    private static double interestRate=0.10;


    AccSavings(String name, String type, double currentBalance){
        super(name, type, currentBalance, 0);
    }

    @Override
    public double updateBalance() { // return? the net total change to add to the fund
        double balance=getCurrentBalance();
        double netChange=(balance*interestRate)-(getLoanAmount()*getLoanInterestRate())-getServiceCharge();
        if(netChange<0){
            //disable account
        }
        balance+=netChange;
        setCurrentBalance(balance);
        return netChange;
    }

    @Override
    public void deposit(double amount) { //implementation of repaying loan at deposit IMP
        //negative check
        if(amount<0) {
            System.out.println("Invalid amount for operation.");
            return;
        }
        if(getLoanAmount()!=0 && amount>=getLoanAmount()) {
            amount-=getLoanAmount();
            setLoanAmount(0);
            System.out.println("Loan has been repaid.");
        }
        double balance=getCurrentBalance();
        balance=balance+amount;
        setCurrentBalance(balance);
    }

    @Override
    public void withdraw(double amount) {
        double balance=getCurrentBalance();
        if(balance-amount<1000){
            System.out.println("Withdraw unsuccessful, insufficient balance for withdraw.");
        }
        else{
            balance=balance-amount;
            setCurrentBalance(balance);
        }
    }

    @Override
    public void requestLoan(double amount) {
        if(getLoanAmount()!=0) {
            System.out.println("Previous loan still unpaid. Please deposit loaned amount or more to repay.");
            return;
        }
        if(amount<=10000){
            if(isLoanApproval()) {
                getLoan(amount);
//                Bank.setInternalFund(Bank.getInternalFund()-amount);
                setLoanApproval(0);
            }
            else {
                setLoanRequest();
                System.out.println("Loan request successful, sent for approval.");
            }
        }
        else{
            System.out.println("Invalid loan request for account.");
        }
    }

    public static void updateRate(double newRate) {
        interestRate=newRate;
    }
}

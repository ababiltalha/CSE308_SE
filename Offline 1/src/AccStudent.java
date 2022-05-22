public class AccStudent extends Account {
    private static double interestRate=0.05;

    AccStudent(String name, String type, double currentBalance){
        super(name, type, currentBalance, 0);
    }

    @Override
    public double updateBalance() {
        double balance=getCurrentBalance();
        double netChange=(balance*interestRate)-(getLoanAmount()*getLoanInterestRate())-getServiceCharge();
        balance+=netChange;
        setCurrentBalance(balance);
        return netChange;
    }

    @Override
    public void deposit(double amount) { //implementation of repaying loan at deposit IMP
        //negative check, need to use every amount instance
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
        if(balance-amount<0){
            System.out.println("Withdraw unsuccessful, insufficient balance for withdraw.");
        }
        else if(amount>10000){
            System.out.println("Invalid withdraw request for account.");
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
        if(amount<=1000){
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

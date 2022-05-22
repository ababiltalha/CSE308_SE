public class AccLoan extends Account {
    AccLoan(String name, String type, double loanAmount){
        super(name, type, 0, loanAmount);
    }

    @Override
    public double updateBalance() {
        double loan=getLoanAmount();
        double netChange= (loan*getLoanInterestRate());
        loan=loan+netChange;
        setLoanAmount(loan);
        return netChange;
    }

    @Override
    public void deposit(double amount) { //implementation of repaying loan at deposit IMP
        //negative check
        if(amount<0) {
            System.out.println("Invalid amount for operation.");
            return;
        }
        if(getLoanAmount()>amount){
            setLoanAmount(getLoanAmount()-amount);
        }
        else{
            setLoanAmount(0);
            System.out.println("Loan has been fully repaid.");
        }
        Bank.setInternalFund(Bank.getInternalFund()+amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Invalid operation for account.");
    }

    @Override
    public void requestLoan(double amount) {
//        if(getLoanAmount()!=0) {
//            System.out.println("Previous loan still unpaid. Please deposit loaned amount or more to repay.");
//            return;
//        }
        if((getLoanAmount()!=0 && amount<=0.05*getLoanAmount())||(getLoanAmount()==0)){
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
        System.out.println("Invalid operation for account.");
    }
}

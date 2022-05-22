public abstract class Employee {
    private String name;
    private final boolean lookUpPrivilege;
    private final boolean approveLoanPrivilege;
    private final boolean changeRatePrivilege;
    private final boolean seeFundPrivilege;

    protected Employee(String name, boolean lookUpPrivilege, boolean approveLoanPrivilege,
                       boolean changeRatePrivilege, boolean seeFundPrivilege) {
        this.name=name;
        this.approveLoanPrivilege = approveLoanPrivilege;
        this.changeRatePrivilege = changeRatePrivilege;
        this.seeFundPrivilege = seeFundPrivilege;
        this.lookUpPrivilege = lookUpPrivilege;
    }


    public boolean isApproveLoanPrivilege() {
        return approveLoanPrivilege;
    }


    public boolean lookUpAccount(Account account){
        if(!lookUpPrivilege){
            System.out.println("You don't have permission for this operation.");
            return false;
        }
        System.out.println(account.getName()+"'s current balance "+account.getCurrentBalance()+"$");
        return true;
    }

    public void seeFund(){
        if(!seeFundPrivilege){
            System.out.println("You don't have permission for this operation.");
            return;
        }
        System.out.println("Fund is "+Bank.getInternalFund()+"$");
    }

    public void approveLoan(Account account, double amount){
        if(!approveLoanPrivilege){
            System.out.println("You don't have permission for this operation.");
            return;
        }
        account.setLoanApproval(amount);
    }

    public void changeInterestRate(String type, double newRate){
        if(!changeRatePrivilege){
            System.out.println("You don't have permission for this operation.");
            return;
        }
        if(type.equalsIgnoreCase("savings")) AccSavings.updateRate(newRate);
        if(type.equalsIgnoreCase("student")) AccStudent.updateRate(newRate);
        if(type.equalsIgnoreCase("loan")) AccLoan.updateRate();
        if(type.equalsIgnoreCase("fixed")) AccFixed.updateRate(newRate);
    }

    public String getName() {
        return name;
    }
}

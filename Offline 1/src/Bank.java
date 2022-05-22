import java.util.ArrayList;

public class Bank {
    private static int clock=0;
    private static double internalFund=1000000;
    private EmpManagingDirector MD;
    private ArrayList<EmpOfficer> O;
    private ArrayList<EmpCashier> C;
    private ArrayList<Account> accountList;
    private Employee activeEmp;
    private Account activeAcc;

    public static double getInternalFund() {
        return internalFund;
    }

    public static void setInternalFund(double internalFund) {
        Bank.internalFund = internalFund;
    }

    Bank(){
        accountList= new ArrayList<>();
        MD= new EmpManagingDirector("MD");
        O= new ArrayList<>(2);
        for (int i = 0; i < 2; i++) {
            O.add(i, new EmpOfficer("O"+(i+1)));
        }
        C= new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            C.add(i, new EmpCashier("C"+(i+1)));
        }
        activeAcc= null;
        activeEmp= null;
    }

    public void incrementClock(){
        //maturity true
        clock++;
        for (Account a:
             accountList) {
            internalFund-=a.updateBalance();
            a.incrementClock();
        }
    }
    private boolean checkForName(String newName)
    {
        for(Account a : accountList){
            if(a.getName().equals(newName)) return false;
        }
        return true;
    }

    private void setActiveAcc(Account a) {
        this.activeAcc = a;
    }

    private void setActiveEmp(Employee e) {
        this.activeEmp = e;
    }

    private void deactivate(){
        this.activeAcc=null;
        this.activeEmp=null;
    }

    public void createAccount(String name, String type, double initialDeposit){
        Account a;
        if(!checkForName(name)){
            System.out.println("Name already taken by another account.");
            return;
        }
        if(!validateAmount(initialDeposit)) return;
        if(type.equalsIgnoreCase("Fixed") && (initialDeposit<100000)){
            System.out.println("Insufficient initial deposit for account.");
            return;
        }
        if(type.equalsIgnoreCase("Fixed")){
            a=(new AccFixed(name, type, initialDeposit));
        }else if(type.equalsIgnoreCase("Student")){
            a=(new AccStudent(name, type, initialDeposit));
        }else if(type.equalsIgnoreCase("Loan")){
            a=(new AccLoan(name, type, initialDeposit));
        }else if(type.equalsIgnoreCase("Savings")){
            a=(new AccSavings(name, type, initialDeposit));
        }else {
            System.out.println("Invalid type of account. Account types are:" +
                    "Savings, Student, Fixed, Loan.");
            return;
        }
        accountList.add(a);
        setActiveAcc(a);
    }

    private boolean validateAmount(double amount){
        if(amount<0) {
            System.out.println("Invalid amount for operation.");
            return false;
        }
        else return true;
    }

    public void openUser(String name){
        if(name.equals("MD")) setActiveEmp(MD);
        else if(name.equals("O1")) setActiveEmp(O.get(0));
        else if(name.equals("O2")) setActiveEmp(O.get(1));
        else if(name.equals("C1")) setActiveEmp(C.get(0));
        else if(name.equals("C2")) setActiveEmp(C.get(1));
        else if(name.equals("C3")) setActiveEmp(C.get(2));
        else if(name.equals("C4")) setActiveEmp(C.get(3));
        else if(name.equals("C5")) setActiveEmp(C.get(4));
        else{
            deactivate();
            for (Account a :
                    accountList) {
                if (a.getName().equals(name)) {
                    setActiveAcc(a);
                    return;
                }
            }
        }
    }

    public void closeUser(){
        deactivate();
    }

    private boolean checkAccLogIn(){
        return activeAcc != null;
    }

    private boolean checkEmpLogIn(){
        return activeEmp != null;
    }


    public void deposit(double amount){
        if(!checkAccLogIn()){
            System.out.println("Log in a deposit account.");
            return;
        }
        double prevBalance=activeAcc.getCurrentBalance();
        activeAcc.deposit(amount);
        if(activeAcc.getCurrentBalance()!=prevBalance)
            System.out.println(amount+"$ deposited. Current balance "+activeAcc.getCurrentBalance()+"$");
        else
            System.out.println("Invalid transaction. Current balance "+activeAcc.getCurrentBalance()+"$");
    }

    public void withdraw(double amount){
        if(!checkAccLogIn()){
            System.out.println("Log in a deposit account.");
            return;
        }
        if(!validateAmount(amount)) return;
        double prevBalance=activeAcc.getCurrentBalance();
        activeAcc.withdraw(amount);
        if(activeAcc.getCurrentBalance()!=prevBalance)
            System.out.println(amount+"$ withdrawn. Current balance "+activeAcc.getCurrentBalance()+"$");
        else
            System.out.println("Invalid transaction. Current balance "+activeAcc.getCurrentBalance()+"$");
    }

    public void query(){
        if(!checkAccLogIn()){
            System.out.println("Log in a deposit account.");
            return;
        }
        activeAcc.queryDeposit();
    }

    public void request(double amount){
        if(!checkAccLogIn()){
            System.out.println("Log in a deposit account.");
            return;
        }
        if(!validateAmount(amount)) return;
        activeAcc.requestLoan(amount);
    }

    public void approve(){
        if(!checkEmpLogIn()){
            System.out.println("Access denied. Log in as an employee.");
            return;
        }
        for (Account a:
             accountList) {
            if(a.isLoanRequest()){
                activeEmp.approveLoan(a, a.getRequestedAmount());
                System.out.println("Loan for "+a.getName()+" approved.");
            }
        }
    }

    public void change(String type, double newRate){
        if(!checkEmpLogIn()){
            System.out.println("Access denied. Log in as an employee.");
            return;
        }
        activeEmp.changeInterestRate(type,newRate);
    }

    public void lookup(String name){
        boolean flag=false;
        if(!checkEmpLogIn()){
            System.out.println("Access denied. Log in as an employee.");
            return;
        }
        for (Account a:
                accountList) {
            if(a.getName().equals(name)){
                flag= activeEmp.lookUpAccount(a);
                break;
            }
        }
        if(!flag) System.out.println("Account not found");
    }

    public void see(){
        if(!checkEmpLogIn()){
            System.out.println("Access denied. Log in as an employee.");
            return;
        }
        activeEmp.seeFund();
    }


}

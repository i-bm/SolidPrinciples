package OpenClosedPrincipal;

public class LoanServiceWhichVioletsOpenClosedPrincipal {
    Loan loan = new Loan();
    public void takeLoan(AccountType accountType){
        //Interest rate is 15% when account type is STANDARD
        if(accountType.equals(AccountType.STANDARD)){
         loan.setTotalLoan((loan.getAmount() * loan.getTerm()) * (loan.getAmount() /100) * 15);
         }
        //Interest rate is 10% when account type is PREMIUM
        else if(accountType.equals(AccountType.PREMIUM)){
            loan.setTotalLoan((loan.getAmount() * loan.getTerm()) * (loan.getAmount() /100) * 10);
        }
    }
}

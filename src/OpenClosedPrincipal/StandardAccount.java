package OpenClosedPrincipal;

public class StandardAccount implements LoanService {
    Loan loan = new Loan();
    @Override
    public void takeLoan(AccountType accountType) {
        loan.setTotalLoan((loan.getAmount() * loan.getTerm()) * (loan.getAmount() /100) * 15);
    }
}

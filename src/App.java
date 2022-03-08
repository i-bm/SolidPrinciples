import OpenClosedPrincipal.AccountType;
import OpenClosedPrincipal.LoanServiceWhichVioletsOpenClosedPrincipal;
import SingleResponsiblityPrincipal.AccountService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.openAccount();

        LoanServiceWhichVioletsOpenClosedPrincipal loan = new LoanServiceWhichVioletsOpenClosedPrincipal();
        loan.takeLoan(AccountType.STANDARD);

    }
}

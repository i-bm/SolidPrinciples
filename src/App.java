import DependancyInversion.ElectricPowerSwitch;
import DependancyInversion.LightBulb;
import DependancyInversion.Switch;
import DependancyInversion.Switchable;
import LiskovSubstitutionPrincipal.Bike;
import LiskovSubstitutionPrincipal.Car;
import LiskovSubstitutionPrincipal.LiskovSubstitution;
import LiskovSubstitutionPrincipal.Vehicle;
import OpenClosedPrincipal.AccountType;
import OpenClosedPrincipal.LoanServiceWhichVioletsOpenClosedPrincipal;
import SingleResponsiblityPrincipal.AccountService;

public class App {
    public static void main(String[] args) {
//        AccountService accountService = new AccountService();
//        accountService.openAccount();
//
//        LoanServiceWhichVioletsOpenClosedPrincipal loan = new LoanServiceWhichVioletsOpenClosedPrincipal();
//        loan.takeLoan(AccountType.STANDARD);

        LiskovSubstitution liskovSubstitution = new LiskovSubstitution();
        liskovSubstitution.testDrive(new Vehicle());
        liskovSubstitution.testDrive(new Bike());
        liskovSubstitution.testDrive(new Car());



    }
}

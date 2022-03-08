package SingleResponsiblityPrincipal;

public class AccountServiceWhichVioletsSingleResponsibilityPrincipal {
    public void openAccount(){
        System.out.println("Fill account details.");
        System.out.println("Persist account object to database.");
        System.out.println("Send out a welcome message.");
    }
}

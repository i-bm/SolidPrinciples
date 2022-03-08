package SingleResponsiblityPrincipal;

public class AccountService {
    AccountRepository repository = new AccountRepository();
    NotificationService notificationService = new NotificationService();

    public void openAccount(){
        System.out.println("Fill account details.");

        repository.save();

        notificationService.sendNotification();
    }
}

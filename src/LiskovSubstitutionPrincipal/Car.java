package LiskovSubstitutionPrincipal;

public class Car extends Vehicle{
    public void start(){
        System.out.println("Starting a car....");
    }
    public void stop(){
        System.out.println("Stopping a car....");
    }
}

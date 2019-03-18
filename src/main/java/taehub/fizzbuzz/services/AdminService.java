package taehub.fizzbuzz.services;

public class AdminService implements UserServiceInterface {
    @Override
    public void print() {
        System.out.println("AdminService was injected.");
    }
}

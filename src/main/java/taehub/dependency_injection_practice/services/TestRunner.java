package taehub.dependency_injection_practice.services;

public class TestRunner {
    public static void main(String[] args) {
        AppService appService = new AppService(new UserService());
        appService.getUserService().print();
        appService = new AppService(new AdminService());
        appService.getUserService().print();
    }
}

package taehub.dependency_injection_practice.services;

public class AppService {

    private UserServiceInterface userService;

    public AppService(UserServiceInterface userService) {
        this.userService = userService;
    }

    public void setUserService(UserService userService) {
        userService = userService;
    }

    public UserServiceInterface getUserService() {
        return userService;
    }
}

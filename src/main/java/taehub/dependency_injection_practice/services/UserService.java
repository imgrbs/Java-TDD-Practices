package taehub.dependency_injection_practice.services;

import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {
    @Override
    public void print() {
        System.out.println("UserService was injected.");
    }
}

package tr.com.example.service;

import org.springframework.stereotype.Service;
import tr.com.example.model.User;

@Service
public interface IUserValidation {
    boolean checkUser(User user);
}

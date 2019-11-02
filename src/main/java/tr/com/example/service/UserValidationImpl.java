package tr.com.example.service;

import org.springframework.stereotype.Service;
import tr.com.example.model.User;

@Service
public class UserValidationImpl implements IUserValidation{
    @Override
    public boolean checkUser(User user) {
        return true;
    }
}

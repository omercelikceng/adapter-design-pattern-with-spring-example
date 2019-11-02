package tr.com.example.externalApi;

import org.springframework.stereotype.Service;
import tr.com.example.model.User;

@Service
public interface IExternalUserValidation {
    boolean checkUser(String email, String name, String surname);
}

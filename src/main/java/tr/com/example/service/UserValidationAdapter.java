package tr.com.example.service;

import org.springframework.stereotype.Service;
import tr.com.example.externalApi.ExternalUserValidationImpl;
import tr.com.example.externalApi.IExternalUserValidation;
import tr.com.example.model.User;

@Service
public class UserValidationAdapter implements IUserValidation{

    @Override
    public boolean checkUser(User user) {
        // External api'ye bu şekilde depend ettik.
        // Yalnızca adapter sinifimiz o external api'ye depend etti.
        // Böylece sistemimizi dis side effect'lerden korumus olduk.
        IExternalUserValidation iExternalUserValidation = new ExternalUserValidationImpl();
        boolean isUser = iExternalUserValidation.checkUser(user.getEmail(), user.getName(), user.getSurname());
        return isUser;
    }
}

package tr.com.example.externalApi;

import org.springframework.stereotype.Service;

@Service
public class ExternalUserValidationImpl implements IExternalUserValidation{
    @Override
    public boolean checkUser(String email, String name, String surname) {
        return false;
    }
}

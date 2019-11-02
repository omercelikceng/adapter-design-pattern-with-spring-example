package tr.com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tr.com.example.dao.IUserDao;
import tr.com.example.model.User;

@Service
public class UserService {

    @Autowired
    private IUserDao iUserDao;

    @Qualifier("userValidationAdapter")
    @Autowired
    private IUserValidation userValidationAdapter;

    public void saveUser(User user) {
        if(userValidationAdapter.checkUser(user)) {
            iUserDao.saveUser(user);
        }
    }

}
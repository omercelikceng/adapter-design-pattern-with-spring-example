package tr.com.example.dao;

import org.springframework.stereotype.Service;
import tr.com.example.model.User;

@Service
public class UserDaoImpl implements  IUserDao {

    public void saveUser(User user) {
        System.out.println("User kaydedildi");
    }
}
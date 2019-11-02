package tr.com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.example.model.User;
import tr.com.example.service.UserService;

@RestController
@RequestMapping("/rest/controller")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
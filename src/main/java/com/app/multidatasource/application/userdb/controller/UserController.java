package com.app.multidatasource.application.userdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.multidatasource.application.accountdb.repository.AccountRepository;
import com.app.multidatasource.application.userdb.entity.User;
import com.app.multidatasource.application.userdb.repository.UserRepository;

import java.util.List;

@RestController
public class UserController {
	
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    UserRepository userRepository;
    @PostMapping("api/v1/account")
    public String saveAccount(@RequestBody User user){
         accountRepository.save(user);
         userRepository.save(user);
        return "Register successful";
    }
    
    @GetMapping ("api/v1/accounts")
    public List<User> getAccountList(){
        return accountRepository.findAll();

    }
}

package org.example.data.repository;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest{
    @Autowired
    private UserRepository userRepository;
    @Test
    void saveUser_testUserIsSaved(){

    }


}
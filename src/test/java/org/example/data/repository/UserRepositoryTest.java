package org.example.data.repository;

import lombok.RequiredArgsConstructor;
import org.example.data.models.User;
import org.example.data.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class UserRepositoryTest{
    @Autowired
    private UserRepository userRepository;

@Test
public void saveUser_testUserIsSaved(){
        User user = new User();
        userRepository.save(user);
        assertEquals(1, userRepository.count());
    }


}
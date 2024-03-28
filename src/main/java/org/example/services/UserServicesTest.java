package org.example.services;

import org.example.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesTest implements UserServices{
    @Autowired
    private UserRepository userRepository;
}

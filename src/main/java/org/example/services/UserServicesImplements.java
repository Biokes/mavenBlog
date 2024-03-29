package org.example.services;

import org.example.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImplements implements UserServices{
    @Autowired
    private UserRepository userRepository;
}

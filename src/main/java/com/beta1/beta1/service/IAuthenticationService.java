package com.beta1.beta1.service;

import com.beta1.beta1.model.Customer;
import java.io.IOException;

public interface IAuthenticationService {
    boolean register(Customer customer) throws IOException;
    boolean login(String username, String password) throws IOException;
}
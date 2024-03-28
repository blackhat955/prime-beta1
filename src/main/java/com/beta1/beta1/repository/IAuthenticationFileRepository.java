package com.beta1.beta1.repository;
import com.beta1.beta1.model.Customer;
import java.io.IOException;

public interface IAuthenticationFileRepository {

    boolean save (Customer customer) throws IOException;
    Customer findByUsername(String username) throws IOException;

}


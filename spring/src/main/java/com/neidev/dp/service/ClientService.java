package com.neidev.dp.service;

import com.neidev.dp.model.Client;
import org.springframework.stereotype.Service;

public interface ClientService {

    Iterable<Client> findAll();

    Client findById(Long id);

    void register(Client client);

    void update(Long id);

    void delete(Long id);
}

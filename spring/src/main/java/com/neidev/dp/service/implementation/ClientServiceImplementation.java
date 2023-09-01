package com.neidev.dp.service.implementation;

import com.neidev.dp.model.Client;
import com.neidev.dp.repository.ClientRepository;
import com.neidev.dp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServiceImplementation implements ClientService {

    @Autowired
    private ClientRepository repository;

    @Override
    public Iterable<Client> findAll() {
        return repository.findAll();
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> optionalClient = repository.findById(id)
        return optionalClient.get();
    }

    @Override
    public void register(Client client) {
        repository.save(client);
    }

    @Override
    public void update(Long id) {
        Optional<Client> optionalClient = repository.findById(id);

        repository.save(optionalClient.get());
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

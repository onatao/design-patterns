package com.neidev.facade;

import com.neidev.facade.external.CepApi;
import com.neidev.facade.external.CrmService;

/**
 *  Facade's main goal is to create one easier interface
 *  to communicate with external complex subsystems.
 */
public class Facade {

    public void clientMigration(String name, String cep) {
        // Recover the city through Singleton Subsystem CepApi
        String city = CepApi.getInstance().getCity(cep);
        // Recover the state through Singleton subsystem CepApi
        String state = CepApi.getInstance().getState(cep);
        // Saving the client using CrmService subsystem
        CrmService.saveClient(name, cep, city, state);
    }
}

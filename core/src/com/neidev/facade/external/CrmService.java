package com.neidev.facade.external;

/**
 *  External subsystem that we use with
 *  FACADE
 *
 *   Pretending to be a client CRM
 */
public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveClient(String name, String cep, String city, String state) {
        System.out.println("Client saved successfully");
    }
}

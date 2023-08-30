package com.neidev.facade.external;

/**
 *  External subsystem that we use with
 *  FACADE
 *
 *  Pretending to be a CEP API
 */
public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getCity(String cep) {
        return "São Paulo";
    }

    public String getState(String cep) {
        return "Capital";
    }
}

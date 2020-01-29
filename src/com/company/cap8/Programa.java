package com.company.cap8;

public class Programa {
    public static void main(String[] args){

        EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();

        facade.buscaCliente("cpf");
        facade.criaFatura(new Cliente(), 500.0);
    }
}

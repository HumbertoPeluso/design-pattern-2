package com.company.cap6;

import java.util.Calendar;

public class Programa {
    public static void main(String[] args) {
        //Regra de negocio
        Mapa mapa = new GoogleMaps();
        mapa.devolveMapa("rua vergueiro");

        //...

        RelogioDoSistema relogioDoSistema = new RelogioDoSistema();
        Calendar dataAtual = relogioDoSistema.hoje();

    }
}

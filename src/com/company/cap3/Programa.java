package com.company.cap3;

import java.util.Calendar;

public class Programa {

    public static void main(String[] args){

        Historico historico = new Historico();
      Contrato c1 =  new Contrato(Calendar.getInstance(), "meuNome", TipoContrato.NOVO );

      historico.adiciona(c1.salvaEstado());

      c1.avanca();
      historico.adiciona(c1.salvaEstado());

      c1.avanca();
      historico.adiciona(c1.salvaEstado());

      Estado estadoAnterior  = historico.pega(1);
System.out.println(estadoAnterior.getEstado().getTipo());


    }

}

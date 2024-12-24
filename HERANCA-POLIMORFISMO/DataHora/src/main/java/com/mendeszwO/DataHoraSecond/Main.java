package com.mendeszwO.DataHoraSecond;



/*

instanciando  um LocalDate no java => mostra a data atual da minha máquina.
instanciando  um LocalDateTime  no Java => mostra a hora e data atual da minha máquina.
Instanciando  um Instant no Java => mostra a hora e data atual da minha máquina.  (FORMATO GMT.
HORARIO DE LONDES. )


-- esse método now(), vai me retornar a data/hora atual do meu dispositivo/máquina.

 */

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        LocalDateTime  dataOneData = LocalDateTime.now();
        LocalDate dataOne = LocalDate.now();
        Instant newInstant = Instant.now();


        System.out.println("LocalDate " + dataOne);
        System.out.println("LocalDateTime " + dataOneData);

        System.out.println("Instant: " + newInstant);

    }
}
package main;

import objeto.medico;
import objeto.paciente;

public class main {

    public main (String[] args) {

        medico Oliver = new medico("Oliver Alves", "Pediatra", 123456);
        medico Luana = new medico("Luana Alves", "Obstetra", 654321);

        paciente p1 = new paciente("Guilherme", "444.555.999-00", "(18) 99999-9999", 22);
        
    }
}
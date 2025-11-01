package Interfaces;

import java.util.ArrayList;

public interface Accionable {
    boolean activarValvulas(ArrayList<String> listaValvulas, ArrayList<Boolean> listaEstados);
    String activarSenalEmergencia(String nombreAlarma);
}

package Models;

import java.util.ArrayList;
import java.util.Random;

public class SensorAtmosfera extends Dispositivo{
    private int tipoAmbiente;

    public SensorAtmosfera(int id, String nombre, String marca, int consumoDeEnergia, int vidaUtilRestante, int tipoAmbiente){
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.consumoDeEnergia = consumoDeEnergia;
        this.vidaUtilRestante = vidaUtilRestante;
        this.tipoAmbiente = tipoAmbiente;
    }


    @Override
    public Integer medirAltitud() {
        Random RNG = new Random();
        int altitud = switch(tipoAmbiente){
            case 1 -> RNG.nextInt(2000, 3000);
            case 2-> RNG.nextInt(4000, 7000);
            case 3 -> RNG.nextInt(500, 1000);
            default -> 2000;
        };

        return altitud;
    }

    @Override
    public Integer medirTemperatura() {
        Random RNG = new Random();
        int temperatura = switch(tipoAmbiente){
            case 1 -> RNG.nextInt(18, 31);
            case 2-> RNG.nextInt(18, 24);
            case 3 -> RNG.nextInt(28, 31);
            default -> 2000;
        };

        return temperatura;
    }

    @Override
    public Boolean activarValvulas(ArrayList<String> listaValvulas, ArrayList<Boolean> listaEstados) {
        for (int i=0; i<listaEstados.size(); i++){
            listaEstados.set(i, false);
        }
        return true;
    }

    @Override
    public String activarSenalEmergencia(String nombreAlarma) {
        return "El sensor de atmosfera con ID: " + id + " ha activado la alarma correspondiente a " + nombreAlarma;
    }

    @Override
    public String guardarDatos(String baseDeDatos) {
        return null;
    }

    public int getTipoAmbiente() {
        return tipoAmbiente;
    }
    public void setTipoAmbiente(int tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }
}

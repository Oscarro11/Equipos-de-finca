package Models;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

public class SensorSuelo extends Dispositivo{
    private int tipoSuelo;

    public SensorSuelo(int id, String nombre, String marca, int consumoDeEnergia, int vidaUtilRestante, int tipoSuelo){
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.consumoDeEnergia = consumoDeEnergia;
        this.vidaUtilRestante = vidaUtilRestante;
        this.tipoSuelo = tipoSuelo;
    }


    @Override
    public Integer medirAltitud() {
        Random RNG = new Random();

        int altitud = switch(tipoSuelo){
            case 1 -> RNG.nextInt(0, 500);
            case 2 -> RNG.nextInt(500, 1000);
            case 3 -> RNG.nextInt(1000, 2000);
            default -> 0;
        };

        return altitud;
    }

    @Override
    public Integer medirTemperatura() {
        Random RNG = new Random();

        int temperatura = switch(LocalTime.now().getHour()){
            case 0, 1, 2, 3, 4, 5 -> RNG.nextInt(13, 16);
            case 6, 7, 8, 9, 10, 11 -> RNG.nextInt(13, 22);
            case 12, 13, 14, 15, 16, 17 -> RNG.nextInt(16, 25);
            case 18, 19, 20, 21, 22, 23 -> RNG.nextInt(11, 20);
            default -> 0;
        };

        return temperatura;
    }

    @Override
    public Boolean activarValvulas(ArrayList<String> listaValvulas, ArrayList<Boolean> listaEstados) {
        if (tipoSuelo != 1) {
            for (int i = 0; i < listaValvulas.size(); i++) {
                listaEstados.set(i, !listaEstados.get(i));
            }
            return true;
        }
        return false;
    }

    @Override
    public String activarSenalEmergencia(String nombreAlarma) {
        return null;
    }

    @Override
    public String guardarDatos(String baseDeDatos) {
        return null;
    }

    public int getTipoSuelo() {
        return tipoSuelo;
    }
    public void setTipoSuelo(int tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }
}

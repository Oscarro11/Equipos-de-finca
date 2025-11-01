package Models;

import java.util.ArrayList;

public class DronImagenes extends Dispositivo{
    private int capacidadImagenes;
    
    public DronImagenes(int id, String nombre, String marca, int consumoDeEnergia, int vidaUtilRestante, int capacidadImagenes){
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.consumoDeEnergia = consumoDeEnergia;
        this.vidaUtilRestante = vidaUtilRestante;
        this.capacidadImagenes = capacidadImagenes;
    }


    @Override
    public Integer medirAltitud() {
        return null;
    }

    @Override
    public Integer medirTemperatura() {
        return null;
    }

    @Override
    public Boolean activarValvulas(ArrayList<String> listaValvulas, ArrayList<Boolean> listaEstados) {
        for (int i=0; i<listaEstados.size(); i++){
            listaEstados.set(i, true);
        }
        return true;
    }

    @Override
    public String activarSenalEmergencia(String nombreAlarma) {
        return "Se ha activado la alarma de imagen correspondiente a " + nombreAlarma;
    }

    @Override
    public String guardarDatos(String baseDeDatos) {
        return "Los datos del dron con ID: " + id + " se han guardado en la base de datos de " + baseDeDatos;
    }

    public int getCapacidadImagenes() {
        return capacidadImagenes;
    }
    public void setCapacidadImagenes(int capacidadImagenes) {
        this.capacidadImagenes = capacidadImagenes;
    }
    
}

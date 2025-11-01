import Models.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Controlador {
    private ArrayList<Dispositivo> listaDispositivos = new ArrayList<Dispositivo>();
    private int cuentaDispositivos = 0;

    public Controlador() {}

    public void generarDispositivos(int cantidadDispositivos){
        Random RNG = new Random();
        for (int i = 0; i < cantidadDispositivos; i++){
            cuentaDispositivos++;

            Dispositivo dispositivoNuevo = switch(RNG.nextInt(3)){
                case 0 -> new SensorSuelo(cuentaDispositivos, "Sensor de suelo No." + cuentaDispositivos, "Capresse", 
                                            RNG.nextInt(5) + 1, 12, RNG.nextInt(3) + 1);

                case 1 -> new DronImagenes(cuentaDispositivos, "Dron de imagenes No." + cuentaDispositivos, "Stabillo", 
                                            RNG.nextInt(20, 31), 60, RNG.nextInt(100, 201));

                case 2 -> new SensorAtmosfera(cuentaDispositivos, "Sensor de atmosfera No." + cuentaDispositivos, "Trident", 
                                            RNG.nextInt(10, 21), 36, RNG.nextInt(3) + 1);
                default -> null;
            };

            listaDispositivos.add(dispositivoNuevo);
        }
    }

    public ArrayList<String> mostrarDispositivos(){
        ArrayList<String> listaInfoDispositivos = new ArrayList<String>();

        for (Dispositivo dispositivo : listaDispositivos) {
            listaInfoDispositivos.add(dispositivo.toString());
        }

        return listaInfoDispositivos;
    }

    public String buscarDispositivoNombre(String nombre){
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo.getNombre().equals(nombre)) {
                return dispositivo.toString();
            }
        }
        return null;
    }

    public String buscarDispositivoId(int id){
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo.getId() == id){
                return dispositivo.toString();
            }
        }
        return null;
    }

    public ArrayList<Object> realizarOperacionesDispositivo(int id){
        ArrayList<Object> resultados = new ArrayList<Object>();
        Dispositivo dispositivoAUsar = null;

        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo.getId() == id){
                dispositivoAUsar = dispositivo;
            }
        }

        if (dispositivoAUsar == null) {
            return null;

        } else{
            ArrayList<String> listaValvulas = new ArrayList<String>();
            listaValvulas.add("valvula1");
            listaValvulas.add("valvula2");
            listaValvulas.add("valvula3");

            ArrayList<Boolean> listaEstados = new ArrayList<Boolean>();
            listaEstados.add(true);
            listaEstados.add(true);
            listaEstados.add(false);

            resultados.add(dispositivoAUsar.medirAltitud());
            resultados.add(dispositivoAUsar.medirTemperatura());
            resultados.add(dispositivoAUsar.activarValvulas(listaValvulas, listaEstados));
            resultados.add(dispositivoAUsar.activarSenalEmergencia("Alarma sismica"));
            resultados.add(dispositivoAUsar.guardarDatos("Base de datos 11"));

            return resultados;
        }
    }

    public ArrayList<String> ordenarDispositivos(){
        ArrayList<Dispositivo> copiaListaDispositivos = new ArrayList<Dispositivo>();
        ArrayList<String> listaNombresOrdenados = new ArrayList<String>();

        for (Dispositivo dispositivo : copiaListaDispositivos) {
            copiaListaDispositivos.add(dispositivo);
        }

        copiaListaDispositivos.sort(Comparator.naturalOrder());

        for (int i = 0; i < copiaListaDispositivos.size(); i++){
            listaNombresOrdenados.set(i, copiaListaDispositivos.get(i).getNombre());
        }

        return listaNombresOrdenados;
    }
}

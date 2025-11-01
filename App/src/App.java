public class App {
    public static void main(String[] args) throws Exception {
        Controlador controlador = new Controlador(10);
        boolean continuarPrograma = true;
       
        Consola.mostrarBienvenida();
        while (continuarPrograma) {
            
            switch (Consola.mostrarMenu()) {
                case 1:
                    Consola.mostrarCaracteristicasCatalogo(controlador.mostrarDispositivos());
                    break;

                case 2:
                    int id = Consola.pedirIdDispositivo();
                    Consola.mostrarCaracteristicasDispositivo(controlador.buscarDispositivoId(id));
                    break;

                case 3:
                    String nombre = Consola.pedirNombreDispositivo();
                    Consola.mostrarCaracteristicasDispositivo(controlador.buscarDispositivoNombre(nombre));
                    break;

                case 4:
                    int id2 = Consola.pedirIdDispositivo();
                    Consola.mostrarResultadoOperacion(controlador.realizarOperacionesDispositivo(id2));
                    break;
            
                case 5:
                    Consola.mostrarNombresOrdenadosCatalogo(controlador.ordenarDispositivos());
                    break;

                case 6:
                    continuarPrograma = false;
                    break;

                default:
                    Consola.mostrarOpcionInvalida();
                    break;
            }
        }

        Consola.mostrarDespedida();
    }
}

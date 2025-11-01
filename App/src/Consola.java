import java.util.Scanner;

import java.util.ArrayList;

public class Consola {
    private static Scanner teclado = new Scanner(System.in);
    
    private static void escribir(String texto){
        System.out.println(texto);
    }

    public static void mostrarCaracteristicasCatalogo(ArrayList<String> infoDispositivos){
        escribir("Estos son los dispositivos con los que cuenta el catalogo: ");
        for (String infoDispositivo : infoDispositivos) {
            mostrarCaracteristicasDispositivo(infoDispositivo);
        }
    }

    public static void mostrarCaracteristicasDispositivo(String infoDispositivo){
        escribir(infoDispositivo);
    }

    public static String pedirNombreDispositivo(){
        escribir("Ingrese el nombre del dispositivo: ");
        return teclado.nextLine();
    }

    public static Integer pedirIdDispositivo(){
        int numero;
        
        escribir("Ingrese el ID del dispositivo: ");
        numero = teclado.nextInt();
        teclado.nextLine();

        return numero;
    }

    public static void mostrarMenu(){
        StringBuilder builder = new StringBuilder();

        builder.append("Elija una de las siguientes opciones: \n");
        builder.append("1) Mostrar catalogo de dispositivos \n");
        builder.append("2) Buscar dipositivo por ID \n");
        builder.append("3) Buscar dipositivo por nombre \n");
        builder.append("4) Realizar muestra de capacidades de dispositivo \n");
        builder.append("5) Mostrar catalogo en base a consumo de energia");

        escribir(builder.toString());
    }

    public static void mostrarBienvenida(){
        escribir("Bienvenido al programa de manejo de dispositivos");
    } 

    public static void mostrarDespedida(){
        escribir("Gracias por usar el programa de manejo de dispositivos");
    }

    public static void mostrarOpcionInvalida(){
        escribir("La opcion ingresada no es valida, por favor intente de nuevo.");
    }

    public static void mostrarResultadoOperacion(ArrayList<Object> resultados){
        escribir(resultados.get(0) != null 
        ? "La medicion de altitud fue de: " + resultados.get(0) + " metros de altura sobre el mar"
        : "La medicion de altitud no puede realizarse con este dispositivo");

        escribir(resultados.get(1) != null 
        ? "La medicion de temperatura fue de: " + resultados.get(1) + " grados Celcius" 
        : "La medicion de temperatura no puede realizarse con este dispositivo");

        escribir(resultados.get(2) != null 
        ? "La activacion de valvulas fue " + ((boolean) resultados.get(2) ? "exitosa" : "no exitosa" )
        : "La activacion de valvulas no puede realizarse con este dispositivo");

        escribir(resultados.get(3) != null 
        ? (String) resultados.get(3) 
        : "La activacion de alarmas no puede realizarse con este dispositivo");

        escribir(resultados.get(4) != null 
        ? (String) resultados.get(4) 
        : "El registro de datos no puede realizarse con este dispositivo");
    }
}

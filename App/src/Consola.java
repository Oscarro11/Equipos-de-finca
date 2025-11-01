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
}

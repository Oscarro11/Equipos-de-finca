package Models;

import Interfaces.*;

public abstract class Dispositivo implements Medible, Accionable, Registrable, Comparable<Dispositivo>{
    protected int id;
    protected String nombre;
    protected String marca;
    protected int consumoDeEnergia;
    protected int vidaUtilRestante;

    @Override
    public int compareTo(Dispositivo dispositivo2) {
        if (consumoDeEnergia > dispositivo2.consumoDeEnergia) {
            return 1;
        } else if (consumoDeEnergia < dispositivo2.consumoDeEnergia) {
            return -1;
        } else{
            return 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ID: " + id);
        builder.append("Nombre: " + nombre);
        builder.append("Marca: " + marca);
        builder.append("Consumo de energia por hora: " + consumoDeEnergia + " Watts");
        builder.append("Meses restantes de vida util: " + vidaUtilRestante);

        return builder.toString();
    }

    public int getConsumoDeEnergia() {
        return consumoDeEnergia;
    }
    public void setConsumoDeEnergia(int consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidaUtilRestante() {
        return vidaUtilRestante;
    }
    public void setVidaUtilRestante(int vidaUtilRestante) {
        this.vidaUtilRestante = vidaUtilRestante;
    }
}

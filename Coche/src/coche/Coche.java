package coche;

public class Coche {
    private String modelo;
    private int a�oFabricacion;
    private boolean enMarcha;
 
    // Constructor, getters y setters

    public Coche (String modelo, int a�oFabricacion) {
        this.modelo = modelo;
        this.a�oFabricacion = a�oFabricacion;
        this.enMarcha = false;
    }


	public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getA�oFabricacion() {
        return a�oFabricacion;
    }

    public void setA�oFabricacion(int a�oFabricacion) {
        this.a�oFabricacion = a�oFabricacion;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }
 
    /* M�todos adicionales*/

    public void arrancar() {
        enMarcha = true;
        System.out.println("�El coche " + modelo + " ha arrancado!");
    }

    public void detener() {
        enMarcha = false;
        System.out.println("El coche " + modelo + " se ha detenido.");
    }

    public String obtenerEstado() {
        return enMarcha ? "En marcha" : "Detenido";
    }

    public void acelerar(int velocidad) {
        if (enMarcha) {
            System.out.println("El coche " + modelo + " est� acelerando a " + velocidad + " km/h.");
        } else {
            System.out.println("El coche " + modelo + " no puede acelerar porque est� detenido.");
        }
    }

    public void frenar(int velocidad) {
        if (enMarcha) {
            System.out.println("El coche " + modelo + " est� frenando a " + velocidad + " km/h.");
        } else {
            System.out.println("El coche " + modelo + " no puede frenar porque est� detenido.");
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", a�oFabricacion=" + a�oFabricacion +
                ", enMarcha=" + enMarcha +
                '}';
    }
}

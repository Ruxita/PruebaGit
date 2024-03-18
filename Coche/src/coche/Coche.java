package coche;

public class Coche {
    private String modelo;
    private int añoFabricacion;
    private boolean enMarcha;
 
    // Constructor, getters y setters

    public Coche (String modelo, int añoFabricacion) {
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.enMarcha = false;
    }


	public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }
 
    /* Métodos adicionales*/

    public void arrancar() {
        enMarcha = true;
        System.out.println("¡El coche " + modelo + " ha arrancado!");
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
            System.out.println("El coche " + modelo + " está acelerando a " + velocidad + " km/h.");
        } else {
            System.out.println("El coche " + modelo + " no puede acelerar porque está detenido.");
        }
    }

    public void frenar(int velocidad) {
        if (enMarcha) {
            System.out.println("El coche " + modelo + " está frenando a " + velocidad + " km/h.");
        } else {
            System.out.println("El coche " + modelo + " no puede frenar porque está detenido.");
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", añoFabricacion=" + añoFabricacion +
                ", enMarcha=" + enMarcha +
                '}';
    }
}

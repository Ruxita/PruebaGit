package coche;
public class CocheMain {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", 2022);
        miCoche.arrancar();
        System.out.println("Estado del coche: " + miCoche.obtenerEstado());
        miCoche.frenar(50);
        miCoche.detener();
        System.out.println("Estado del coche: " + miCoche.obtenerEstado());
                // Crear un objeto de la clase Motor
                Motor motorCoche = new Motor("Gasolina", 150);

                // Mostrar información del motor
                System.out.println("Información del motor del coche:");
                System.out.println(motorCoche);

                // Cambiar el tipo de motor
                motorCoche.setTipo("Eléctrico");

                // Mostrar información actualizada del motor
                System.out.println("Información actualizada del motor del coche:");
                System.out.println(motorCoche);
            }
        
   }



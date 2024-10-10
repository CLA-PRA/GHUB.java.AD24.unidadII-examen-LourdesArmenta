package miPrincipal;

public class Temperatura {
    private double centigrados;

    // Constructor que acepta un valor de temperatura en grados Centígrados
    public Temperatura(double centigrados) {
        this.centigrados = centigrados;
    }

    // Método para convertir la temperatura a Fahrenheit
    public double toFahrenheit() {
        return (centigrados * 9/5) + 32;
    }

    // Método para establecer la temperatura en grados Centígrados
    public void setCentigrados(double centigrados) {
        this.centigrados = centigrados;
    }

    // Método para obtener la temperatura en grados Centígrados
    public double getCentigrados() {
        return centigrados;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        Temperatura temp = new Temperatura(25);
        System.out.println("Temperatura en Fahrenheit: " + temp.toFahrenheit());
        System.out.println("Temperatura en Celsius: " + temp.getCentigrados());
    }
}
    


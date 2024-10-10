package miPrincipal;

public class FechaUtil {
    // Método para devolver el nombre del día de la semana basado en la letra inicial
    public static String getDiaSemana(char inicial) {
        //coloca el codigo faltante
    }

    // Método para determinar el número de días en un mes y año dados sin usar Calendar
    //condidera que febrero tiene 28 dias y 29 en año bisiesto
    //el método debe devolver -1 si el mes no es válido
    //el metodo debe ser publico y estatico
   

    // Ejemplo de uso
    public static void main(String[] args) {
        // Prueba del método getDiaSemana
        System.out.println("Día de la semana para 'L': " + getDiaSemana('L'));
        System.out.println("Día de la semana para 'm': " + getDiaSemana('m'));

        // Prueba del método getNumeroDiasMes
        int mes = 2;
        int año = 2023;
        System.out.println("Número de días en el mes " + mes + " del año " + año + ": " + getNumeroDiasMes(mes, año));
    }
}

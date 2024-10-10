package miPrincipal;

public class FechaUtil {
    // Método para devolver el nombre del día de la semana basado en la letra inicial
    public static String getDiaSemana(char inicial) {
        switch (Character.toLowerCase(inicial)) {
            case 'l': return "Lunes";
            case 'm': return "Martes";
            case 'x': return "Miércoles";
            case 'j': return "Jueves";
            case 'v': return "Viernes";
            case 's': return "Sábado";
            case 'd': return "Domingo";
            default: return "Inicial no valida";
        }
    }

    // Método para determinar el número de días en un mes y año dados sin usar Calendar
    public static int getNumeroDiasMes(int mes, int año) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    return 29; // Año bisiesto
                } else {
                    return 28;
                }
            default:
                return -1; // Mes no válido
        }
    }

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

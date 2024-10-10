package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {
    private Hora hora;
    private Temperatura temperatura;

    @BeforeEach
    public void setUp() {
        hora = new Hora();
        temperatura = new Temperatura(0);

    }

    @Test
    public void testPunto() {
        Punto punto = new Punto(3, 4);
        assertEquals(3, punto.x);
        assertEquals(4, punto.y);
        punto.x = 5;
        assertEquals(5, punto.x);
        punto.y = 6;
        assertEquals(6, punto.y);
    }

    @Test
    public void testSumar() {
        Operador operador = new Operador();
        float resultado = operador.sumar(5.0f);
        assertEquals(5.0f, resultado, 0.001);
        
        resultado = operador.sumar(3.0f);
        assertEquals(8.0f, resultado, 0.001);
    }

    @Test
    public void testFinalize() {
        Operador operador = new Operador();
        operador.sumar(5.0f);
        
        // Dejar de referenciar el objeto operador
        operador = null;
        
        // Forzar la recolección de basura
        System.gc();
        
        // Esperar un poco para que el recolector de basura se ejecute
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // No podemos verificar directamente la memoria aquí porque el objeto ha sido recolectado
        // Pero podemos verificar la salida en la consola para ver el mensaje de finalize
    }

    @Test
    public void testAdelantar() {
        hora.setHora(10);
        hora.setMinuto(30);
        hora.setSegundo(45);
        hora.adelantar(1, 20, 30); // Adelantar 1 hora, 20 minutos y 30 segundos
        assertEquals(11, hora.getHora());
        assertEquals(51, hora.getMinuto());
        assertEquals(15, hora.getSegundo());
    }

    @Test
    public void testReiniciar() {
        hora.setHora(10);
        hora.setMinuto(30);
        hora.setSegundo(45);
        hora.reiniciar(13,15,5);
        assertEquals(13, hora.getHora());
        assertEquals(15, hora.getMinuto());
        assertEquals(5, hora.getSegundo());
    }

    @Test
    public void testImprimir() {
        hora.setHora(10);
        hora.setMinuto(30);
        hora.setSegundo(0);

        // Capturar la salida del método imprimir
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        hora.imprimir();

        // Verificar la salida
        String expectedOutput = "10:30:00\n";
        assertEquals(expectedOutput, outContent.toString());

        // Restaurar la salida estándar
        System.setOut(System.out);
    }
    @Test
    public void testConstructor() {
        // Probar el constructor con un valor específico
        Temperatura temp = new Temperatura(25.0);
        assertEquals(25.0, temp.getCentigrados());
    }

    @Test
    public void testToFahrenheit() {
        // Probar la conversión a Fahrenheit
        temperatura = new Temperatura(0); // 0 grados centígrados
        assertEquals(32.0, temperatura.toFahrenheit());

        temperatura = new Temperatura(100); // 100 grados centígrados
        assertEquals(212.0, temperatura.toFahrenheit());

        temperatura = new Temperatura(-40); // -40 grados centígrados
        assertEquals(-40.0, temperatura.toFahrenheit());
    }

    @Test
    public void testGetDiaSemana() {
        assertEquals("Lunes", FechaUtil.getDiaSemana('L')); // Lunes
        assertEquals("Martes", FechaUtil.getDiaSemana('M')); // Martes
        assertEquals("Miércoles", FechaUtil.getDiaSemana('X')); // Miércoles
        assertEquals("Jueves", FechaUtil.getDiaSemana('J')); // Jueves
        assertEquals("Viernes", FechaUtil.getDiaSemana('V')); // Viernes
        assertEquals("Sábado", FechaUtil.getDiaSemana('S')); // Sábado
        assertEquals("Domingo", FechaUtil.getDiaSemana('D')); // Domingo
        assertEquals("Inicial no valida", FechaUtil.getDiaSemana('Z')); // Carácter no válido
    }

    @Test
    public void testGetDiasMes() {
        assertEquals(31, FechaUtil.getNumeroDiasMes(1, 2023)); // Enero
        assertEquals(28, FechaUtil.getNumeroDiasMes(2, 2023)); // Febrero no bisiesto
        assertEquals(29, FechaUtil.getNumeroDiasMes(2, 2024)); // Febrero bisiesto
        assertEquals(30, FechaUtil.getNumeroDiasMes(4, 2023)); // Abril
        assertEquals(-1, FechaUtil.getNumeroDiasMes(13, 2023)); // Mes no válido
    }





    


    
}
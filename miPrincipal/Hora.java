package miPrincipal;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void adelantar(int horas, int minutos, int segundos) {
        this.segundo += segundos;
        this.minuto += minutos + this.segundo / 60;
        this.hora += horas + this.minuto / 60;
        this.segundo %= 60;
        this.minuto %= 60;
        this.hora %= 24; // Asumiendo que queremos un formato de 24 horas
    }

   

    public void reiniciar(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        
    }

    /* 
    public String imprimir(){
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
        */
    public void imprimir() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }


    @Override
    public String toString() {
        return "Hora [hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + "]";
    }

    

    
    
    
    
}

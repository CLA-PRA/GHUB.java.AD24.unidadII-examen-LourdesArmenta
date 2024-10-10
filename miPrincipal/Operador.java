package miPrincipal;

public class Operador {
    public float memoria;
    public Operador(){
        System.out.println("Activar máquina operador");
        memoria =0.0f;
    }

    public float sumar(float f){
        memoria = memoria + f;
        return memoria;
    }

    @Override
    protected void finalize(){
        System.out.println("Desactivar máquina operador");
        memoria = 0.0f;
    }
    
}

package miPrincipal;

public class TestOperador {
    public static void main(String[] args) {
       Operador  op1,op2,op3;
       System.out.println("Inicio de la prueba de la clase Operador");
       op1 = new Operador();
       op2 = new Operador();
       op2 = op1; // op2 y op1 apuntan al mismo objeto
       System.gc(); //Solicita al recolector de basura que libere memoria y debe liberar la memoria de op2
      
       
       try{
          Thread.sleep(1000);//espero un segundo para dar oportunidad al recolector de basura
       }catch(InterruptedException e){
           System.out.println("Error en la espera");
       }
       op3 = new Operador();
       System.gc(); //Solicita al recolector de basura que libere memoria no hay nada que recolectar
       try{
            Thread.sleep(1000);//espero un segundo para dar oportunidad al recolector de basura
        }catch(InterruptedException e){
            System.out.println("Error en la espera");
        }

        op3=null;
        System.gc(); //Solicita al recolector de basura que libere memoria y debe liberar la memoria de op3
       try{
            Thread.sleep(1000);//espero un segundo para dar oportunidad al recolector de basura
        }catch(InterruptedException e){
            System.out.println("Error en la espera");
        }

        System.out.println(op2.sumar(5.0f));




       System.out.println("Fin de la prueba de la clase Operador");

    
    }
}

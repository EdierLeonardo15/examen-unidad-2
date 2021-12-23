package : pe.edu.upeu.eps;

/**
 * Hello world!
 *
 */
public class App {

  public void menuOpciones() {        
    int opcionesA=0;
    System.out.println("Bienvenido al examen ");
    String msg="\nElija la acción a realizar:\n"+
    "\n1=Pregunta 2"+
    "\n2=Pregunta 3"+
    "\n3=Pregunta 4"+
    "\n4=Pregunta 5";
   
    opcionesA=lt.leer(0, msg);  
    while(opcionesA!=0){
        switch(opcionesA) {

          case 1:impuestoAutos(); break;

        
          case 2:TMultiplicar1hasta20(); break;  
          
          
          case 3:numerosperfectos(); break; 
        

          case 4:int x=lt2.leer(0,"Introduzca la base");
                        int n=lt2.leer(0,"Introduzca el exponente");
                        System.out.println("El resultado de "+x+" con exponente "+n+" es: "+ res.potencia(int x, int n));break; 


      

          default: System.out.println("Elija una opcion existente!!");
        }   
      System.out.println("----------------------------------------------------------------");         
      opcionesA=lt.leer(0,msg);        
    }        
}


    public static void main( String[] args ){
     menuOpciones();
    }


}

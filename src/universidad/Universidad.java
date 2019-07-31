package universidad;


import java.util.*;



public class Universidad {


   
/**
 * @author Daniel Ortiz - Federico Bornachera
 *
 */

    
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        
        ArrayList <Alumnos> recorrer = new ArrayList(); 
        
        String tipoDocumento, documento, apellidos, nombres, facultad, programa;
        int semestre, edad, opcion;
        boolean activo = true, ciclo = true;
        
        System.out.println("Seleccione: ");
        System.out.println("1. Agregar");
        System.out.println("2. Modificar");
        System.out.println("3. Mostrar");
        System.out.println("4. Salir");
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Ingrese tipo de documento");
                tipoDocumento = leer.next();
                System.out.println("Ingrese documento");
                documento=leer.next();
                System.out.println("Ingrese Apellido");
                apellidos=leer.next();
                System.out.println("Ingrese Nombre");
                nombres=leer.next();
                System.out.println("Ingrerse Facultad");
                facultad=leer.next();
                System.out.println("Ingrese Programa");
                programa=leer.next();
                System.out.println("Ingrese su Edad");
                edad=leer.nextInt();
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default :
                System.out.println("!!ERROR¡¡");
                break;
        }
                
                
        //fin
   }
    
}

       
        
        
    
    


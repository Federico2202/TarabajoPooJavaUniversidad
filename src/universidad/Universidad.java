package universidad;


public class Universidad {


    public static void main(String[] args) {
       
        Alumnos a1, a2;
        Administrativo ad1;
        Catedratico c1;
        Planta p1;
        
        a1 = new Alumnos("TI","1082863254", "Bornachera Hernandez","Federico Andres", 17, true, "22042202", "Ingenieria", "Sistemas", 1);
        System.out.println(a1.mostrar());
        System.out.println("");
        
        c1 = new Catedratico("CC", "1082863254", "Casanares Camela", "Maria", 29, true, "Ing. Sistemas", "Algoritmos", "01/01/2019", "31/12/2019");
        System.out.println(c1.mostrar());
        
        ad1 = new Administrativo("CC", "12345667", "Garcia", "Luis", 21, true, "Desarrollador", "01/01/2019");
        System.out.println(ad1.mostrar());
        
    }
    
}

package universidad;

public class Planta extends Docente{

    private String fechaContrato;
    private int cantProyectos;

    public Planta(String tipoDocumento, String documento, String apellidos, 
            String nombres, int edad, boolean activo, String profesion, 
            String asignatura,
            String fechaContrato, int cantProyectos) {
        super(tipoDocumento, documento, apellidos, nombres, edad, activo, profesion, asignatura);
        this.fechaContrato = fechaContrato;
        this.cantProyectos = cantProyectos;
    }
    
    public String mostrar(){
        String resultado="";
        resultado = mostrarInfo()+"\n"+profesion+"\n"+asignatura+"\n"+fechaContrato+"\n"+cantProyectos;
        return resultado;
    }
    
}

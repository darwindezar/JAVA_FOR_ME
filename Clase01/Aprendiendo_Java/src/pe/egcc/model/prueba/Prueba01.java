
package pe.egcc.model.prueba;

import pe.egcc.model.Estudiante;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args){
        
        
        Estudiante est01= new Estudiante();
        
        System.out.println(est01);
        
        est01.setNombre("Darwin");
        est01.setApellido("Deza");
        est01.setEmail("darwindezar@hotmail.com");
        est01.setEdad(21);
        est01.setEstado(false);
        
        System.out.println("Nombre: " + est01.getNombre());
        System.out.println("-------------");
        System.out.println(est01);
        
    }
}

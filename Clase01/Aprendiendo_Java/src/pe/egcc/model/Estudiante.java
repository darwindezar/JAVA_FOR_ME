
package pe.egcc.model;


public class Estudiante {

private String nombre;
private String apellido;
private int edad;
private boolean estado;
private String email;

public Estudiante()
{
    nombre = "Gustavo";
    apellido = "Coronel";
    edad = 40;
    estado = true;
    email = "gcoronel@gmail.com";
    System.out.println("Objeto creado !!!!!!!");
}
/*Constructor adicional
 * 
 * @param nombre
 * @param apellido
 * @param edad
 * @param estado
 * @param email 
 */

    public Estudiante(String nombre, String apellido, int edad, boolean estado, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estado = estado;
        this.email = email;
    }

    @Override
    protected void finalize() throws Throwable {
        System.err.println("Chau Objeto!!!!!!");
    }

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String toString() {
        String repo ="";
        repo += "nombre: " + nombre + "\n";
        repo += "Apellido: " + apellido + "\n";
        repo += "Email: " + email + "\n";
        repo += "Edad: " + edad + "\n";
        repo += "Casado: " + estado + "\n";
        return repo;
    }
    
}

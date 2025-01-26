
package Model;

/**
 *
 * @author KAREN COTRINA MENA
 */
public class Persona {
     String DNI;
     String nombres;
     Fecha fec_nac; 
    String email;
    
    public int getEdad() {
    Fecha fechaActual = new Fecha();
    return fechaActual.diferenciaFecha(fechaActual, this.fec_nac);
}

    public Persona(String DNI, String nombres, Fecha fec_nac, String email) {
        this.DNI = DNI;
        this.nombres = nombres;
        this.fec_nac = fec_nac;
        this.email = email;
    }
// Getters and Setters
    
 

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Fecha getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(Fecha fec_nac) {
        this.fec_nac = fec_nac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombres=" + nombres + ", fec_nac=" + fec_nac + ", email=" + email + '}';
    }
    
    
    
      
}

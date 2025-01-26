package Model;

/**
 *
 * @author KAREN COTRINA MENA
 */
public class Docente extends Persona {

    private Fecha fec_registro;
    private Fecha fec_titulacion;
    private boolean docente_vigente;
    private String telefono;

    public Docente(Persona persona, Fecha fec_titulacion, String telefono) {
        super(persona.DNI, persona.nombres, persona.fec_nac, persona.email);
        this.fec_titulacion = fec_titulacion;
        this.telefono = telefono;
        this.fec_registro = new Fecha();
        this.docente_vigente = true;
    }

    public Fecha getFec_registro() {
        return fec_registro;
    }

    public void setFec_registro(Fecha fec_registro) {
        this.fec_registro = fec_registro;
    }

    public Fecha getFec_titulacion() {
        return fec_titulacion;
    }

    public void setFec_titulacion(Fecha fec_titulacion) {
        this.fec_titulacion = fec_titulacion;
    }

    public boolean isDocente_vigente() {
        return docente_vigente;
    }

    public void setDocente_vigente(boolean docente_vigente) {
        this.docente_vigente = docente_vigente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        String txt = " Docente" + '\n'
                + "Fecha de registro     : " + fec_registro + '\n'
                + "Fecha de titulacion   : " + fec_titulacion + '\n'
                + "Docente vigente       : " + docente_vigente + '\n'
                + "Telefono              : " + telefono;
        return txt;
    }

    public int getTiempoExperiencia() {
        Fecha fechaActual = new Fecha();
        return fechaActual.diferenciaFecha(fechaActual, this.fec_titulacion);
    }

}

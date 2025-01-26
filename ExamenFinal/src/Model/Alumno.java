package Model;

/**
 *
 * @author KAREN COTRINA MENA
 */
public class Alumno extends Persona {

    private Fecha fec_registro;
    private boolean alumno_vigente;
    private String telefono;

    public Alumno(Persona persona, String telefono, Fecha fec_registro) {
        super(persona.DNI, persona.nombres, persona.fec_nac, persona.email);
        this.telefono = telefono;
        this.fec_registro = fec_registro;
        this.alumno_vigente = true;
    }

    public Fecha getFec_registro() {
        return fec_registro;
    }

    public void setFec_registro(Fecha fec_registro) {
        this.fec_registro = fec_registro;
    }

    public boolean isAlumno_vigente() {
        return alumno_vigente;
    }

    public void setAlumno_vigente(boolean alumno_vigente) {
        this.alumno_vigente = alumno_vigente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        String txt = "  " + '\n'
                + "---- Imformacion del alumno " + " ----" + '\n'
                + "Fecha de registro   : " + fec_registro + '\n'
                + "Alumno vigente      : " + alumno_vigente + '\n'
                + "Telefono            : " + telefono;

        return txt;

    }

    public int getAntiguedad() {
        Fecha fechaActual = new Fecha();
        return fechaActual.diferenciaFecha(fechaActual, this.fec_registro);
    }

}

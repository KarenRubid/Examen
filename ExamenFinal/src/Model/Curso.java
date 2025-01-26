package Model;

/**
 *
 * @author KAREN COTRINA MENA
 */
public class Curso {

    private int cod_curso;
    private String nombre;
    private boolean curso_vigente;
    int años_experiencia;

    public Curso(int cod_curso, String nombre, int años_experiencia) {
        this.cod_curso = cod_curso;
        this.nombre = nombre;
        this.curso_vigente = true;
        this.años_experiencia = años_experiencia;
    }

    public int getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCurso_vigente() {
        return curso_vigente;
    }

    public void setCurso_vigente(boolean curso_vigente) {
        this.curso_vigente = curso_vigente;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }

    public void setAños_experiencia(int años_experiencia) {
        this.años_experiencia = años_experiencia;
    }

    @Override
    public String toString() {
        String txt = "Curso" + '\n'
                + "Codigo del curso     : " + cod_curso + '\n'
                + "Nombre               : " + nombre + '\n'
                + "Curso vigente        : " + curso_vigente + '\n'
                + "Años de experiencia  : " + años_experiencia;

        return txt;
    }
}

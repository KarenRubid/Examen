package Model;

/**
 *
 * @author KAREN COTRINA MENA
 */
public class CursoAperturado {

    private int cod_curso_aperturado;
    private Docente docente;
    private Curso curso;
    private Fecha fecha_inicio;
    private int costo;

    public CursoAperturado(int cod_curso_aperturado, Docente docente, Curso curso, Fecha fecha_inicio) {
        if (docente.getTiempoExperiencia() < curso.años_experiencia) {
            throw new IllegalArgumentException("El docente no cumple con los años de experiencia requeridos.");
        }
        this.cod_curso_aperturado = cod_curso_aperturado;
        this.docente = docente;
        this.curso = curso;
        this.fecha_inicio = fecha_inicio;
    }

    public int getCod_curso_aperturado() {
        return cod_curso_aperturado;
    }

    public void setCod_curso_aperturado(int cod_curso_aperturado) {
        this.cod_curso_aperturado = cod_curso_aperturado;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Fecha getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Fecha fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String toString() {
        String txt = "------------------" + '\n'
                + "Codigo del curso aperturado : " + cod_curso_aperturado + '\n'
                + "Docente              : " + docente + '\n'
                + "Curso                : " + curso + '\n'
                + "Costo                : " + costo + '\n'
                + "Fecha de inicio      : " + fecha_inicio;
        return txt;
    }

}

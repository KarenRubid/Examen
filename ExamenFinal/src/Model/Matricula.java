
package Model;

/**
 *
 * @author KAREN COTRINA MENA
 */
public class Matricula {
     private CursoAperturado cursoMatriculado;
    private Alumno alumno;
    private boolean pagado;
    private Fecha fec_pago;
    
    public Matricula(CursoAperturado cursoMatriculado, Alumno alumno, boolean pagado) {
    if (alumno.getEdad() < 18) {
        throw new IllegalArgumentException("El alumno debe ser mayor de 18 años.");
    }
    this.cursoMatriculado = cursoMatriculado;
    this.alumno = alumno;
    this.pagado = pagado;
    this.fec_pago = null; // Inicializado como null, si no se proporciona al inicio
}
    
    

    
    public CursoAperturado getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(CursoAperturado cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Fecha getFec_pago() {
        return fec_pago;
    }

    public void setFec_pago(Fecha fec_pago) {
        this.fec_pago = fec_pago;
    }

    @Override
    public String toString() {
        return "Matricula{" + "cursoMatriculado=" + cursoMatriculado + ", alumno=" + alumno + ", pagado=" + pagado + ", fec_pago=" + fec_pago + '}';
    }
    
    
}

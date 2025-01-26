
package Controller;
import Model.*;

/**
 *
 * @author KAREN COTRINA MENA
 */
public class Test {
    public static void main(String[] args) {
        
        Fecha fecha_Nac_Alumno = new Fecha(15, 8, 2000);
        Persona persona_Alumno = new Persona("12345678", "ANA PEREZ", fecha_Nac_Alumno, "ana@gmail.com");
        Fecha fecha_Registro = new Fecha(1, 1, 2020);
        Alumno alumno = new Alumno(persona_Alumno, "98765432", fecha_Registro);

        Fecha fechaTitulacionDocente = new Fecha(1, 1, 2010);
        Persona Docente = new Persona("87654321", "JUANA COTRINA", new Fecha(1, 1, 1980), "juana@gmail.com");
        
        Docente docente = new Docente(Docente, fechaTitulacionDocente, "987654322");

        Curso curso = new Curso(1, "Matematicas", 10);
        CursoAperturado curso_Aperturado = new CursoAperturado(001, docente , curso , new Fecha (1, 2, 2025));

        Matricula matricula = new Matricula(curso_Aperturado, alumno, true);

        System.out.println("Alumno matriculado: " + alumno);
        System.out.println("Curso matriculado: " + curso_Aperturado);
        
}
    
}


package Model;

/**
 *
 * @author KAREN COTRINA MENA
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha() {
        this.dia = 26;
        this.mes = 1;
        this.año = 2025;
        
    }
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
//toString
    
    @Override
    public String toString() {
        return "{" + "dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + '}';
    }
  
     public int diferenciaFecha(Fecha fecha1, Fecha fecha2) {
        return Math.abs(fecha1.año - fecha2.año);
    }
    
}

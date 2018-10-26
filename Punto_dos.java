/* Javier Alexander Ibarra 
 * 1115079783
 * Ingenieria en sistemas
 * Lenguaje de programacion 3
 * noveno semestre
 */ 
package punto_dos;
import javax.swing.JOptionPane;

public class Punto_dos {

    
    public static void main(String[] args) {
        String nombre;
        int horas_trabajadas;
        int precio_hora;
        int cedula;
       // int salario;
        
        
        nombre =JOptionPane.showInputDialog("Nombre del trabajador: ");
        cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del empleado: "));
       // salario = Integer.parseInt(JOptionPane.showInputDialog("Digite el salario empleado: "));
        horas_trabajadas = Integer.parseInt(JOptionPane.showInputDialog("Numero de horas semanales: "));
        precio_hora = Integer.parseInt(JOptionPane.showInputDialog("Digite precio por hora: "));
        
        int salud=(500000*5)/100;
        int pension= (500000*10)/100;
        int total= (500000-salud-pension);
        
        JOptionPane.showMessageDialog(null,"NOMINA DEL EMPLEADO \n"+ "cedula: "+cedula+"\n Nombre: "+nombre+"\nSalario"+"Salario basico: 500.000"+"\n Descuentos==> "+"Salud(5%) "+salud +"   "+ "Pension(10%) "+pension + "\n Total a pagar ==> "+ total );
    }
    
}

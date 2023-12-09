
package lab9p1_alejandrareyes;
import javax.swing.JOptionPane;
// fila 2, columna 5
/**
 *
 * @author aleja
 */
public class Lab9P1_AlejandraReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object [] opciones = {"Gusanito", "Salir"};
        
        int elijio = JOptionPane.showOptionDialog(null, "Lab 9 - Q4 - 2023", "Lab9",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        switch (elijio) {
            case 0:
                String tablero = JOptionPane.showInputDialog("Ingrese las dimensiones del tablero en el formato ancho,alto");
                
                String [] dimensiones = tablero.split(",");
                int filas = Integer.parseInt(dimensiones[0]);
                int columnas = Integer.parseInt(dimensiones[1]);
                
                while (filas<4 || filas >10 || columnas < 4 || columnas>10){
                    JOptionPane.showMessageDialog(null, "Las dimensiones deben estar entre 4 y 10 \n");
                    tablero = JOptionPane.showInputDialog("Ingrese denuevo las dimensiones del tablero en el formato ancho,alto");
                    dimensiones = tablero.split(",");
                    filas = Integer.parseInt(dimensiones[0]);
                    columnas = Integer.parseInt(dimensiones[1]);
                
                }
                
                   
                Gusanito gus = new Gusanito(filas, columnas);
                
                
                break;
                
            case 1:
                System.exit(0);
                break; 
        }
        
    }
    
}


package carrera.hilos;

import javax.swing.SwingUtilities;

/**
 *
 * @author Laurix
 */
public class F1 {

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Pista(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        
        });
    }
    
}

 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package healthcarefraud;

import java.awt.Dimension;
import java.awt.Toolkit;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        LoginFrame l=new LoginFrame();
        l.setVisible(true);
        l.setSize(d);
    }

}


package optical_clinic;

import database_connector.DBKonek;


public class Optical_Clinic {
   
    public static void main(String[] args) {
        DBKonek db = new DBKonek();
        HomePage HP = new HomePage();
        HP.setVisible(true);
        HP.pack();
        HP.setLocationRelativeTo(null);
    }
    
}

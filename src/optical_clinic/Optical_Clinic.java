
package optical_clinic;

import database_connector.DBKonek;


public class Optical_Clinic {
   
    public static void main(String[] args) {
        DBKonek db = new DBKonek();
        Logins LS = new Logins();
        LS.setVisible(true);
        LS.pack();
        LS.setLocationRelativeTo(null);
    }
    
}

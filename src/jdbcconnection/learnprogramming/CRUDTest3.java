package jdbcconnection.learnprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CRUDTest3 {

    public static void main(String[] args) {     //Here we are going to insert values into the table dept we just created

        try {   //Same Methods as in the Main class; SOme of the Initial steps will remain the same!!

            //2nd, We are going to load and register the oracle driver
            Class.forName("oracle.jdbc.driver.OracleDriver");  //We have to put a try catch block if not we will get an error

            //3rd Now, we have to create a connection
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/Rklamadji1", "hr", "11");
            //getConnectionMethod takes 3 parameters which are ("URl", "Username", "Password")


            Statement st = conn.createStatement();    // 4th Here, we are creating our Statement Object!!

            //Now, I am updating some records that I mistakly insert twice

            st.executeUpdate("UPDATE emp SET id = 1 WHERE id = 2"); // Here, I am changing the data from the emp table;


            conn.close(); //To close our connection Method!!


        } catch (Exception e) {

            e.printStackTrace();

        }

    }


}

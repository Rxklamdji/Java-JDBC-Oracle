package jdbcconnection.learnprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CRUDTest2 {

    public static void main(String[] args) {     //Here we are going to insert values into the table dept we just created

        try {   //Same Methods as in the Main class; SOme of the Initial steps will remain the same!!

            //2nd, We are going to load and register the oracle driver
            Class.forName("oracle.jdbc.driver.OracleDriver");  //We have to put a try catch block if not we will get an error

            //3rd Now, we have to create a connection
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/Rklamadji1", "hr", "11");
            //getConnectionMethod takes 3 parameters which are ("URl", "Username", "Password")


            Statement st = conn.createStatement();    // 4th Here, we are creating our Statement Object!!

            //Now, I am creating a new Table into the Oracle Database; so I will be using an execute-Update method!!

            st.executeUpdate("INSERT INTO dept(dept_id,dept_name) VALUES(2,'Law')");
            //Since I only know the values of only 2 columns, I can precise the name of the 2 columns I know, and insert their values;


            conn.close(); //To close our connection Method!!


        } catch (Exception e) {

            e.printStackTrace();

        }

    }


}

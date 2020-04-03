package jdbcconnection.learnprogramming;

import java.sql.*;

public class CRUDTest {    // THis class will help me create a table from here that will appear into the Oracle Database!!

    public static void main(String[] args) {

        try {   //Same Methods as in the Main class; SOme of the Initial steps will remain the same!!

            //2nd, We are going to load and register the oracle driver
            Class.forName("oracle.jdbc.driver.OracleDriver");  //We have to put a try catch block if not we will get an error

            //3rd Now, we have to create a connection
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/Rklamadji1", "hr", "11");
            //getConnectionMethod takes 3 parameters which are ("URl", "Username", "Password")


            Statement st = conn.createStatement();    // 4th Here, we are creating our Statement Object!!

            //Now, I am creating a new Table into the Oracle Database; so I will be using an execute-Update method!!

            st.executeUpdate("CREATE TABLE dept(dept_id int, dept_name varchar2(20), dept_location varchar2(30))");
            //THis Execute-Update generally return an int value as a result which is the number of row affected by it
            //but since we are not updating any row, so this number should be 0;



            conn.close(); //To close our connection Method!!


        } catch (Exception e) {

            e.printStackTrace();

        }



    }




}

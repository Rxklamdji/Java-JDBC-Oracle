package jdbcconnection.learnprogramming;

import java.sql.*; //This single line of code will import all of the JDBC related class we need for connection, manager, and all things,
//import java.sql.Connection;   //Don't need to type this because of line 3
//import java.sql.DriverManager;  //Don't need to type this either!!

public class Main {

    public static void main(String[] args) {

        try {



        System.out.println("Connecting to the database"); //1st thing our app will say is that we are connecting to the database


        //2nd, We are going to load and register the oracle driver
            Class.forName("oracle.jdbc.driver.OracleDriver");  //We have to put a try catch block if not we will get an error

        //3rd Now, we have to create a connection
            Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Rklamadji1", "hr", "11");
            //getConnectionMethod takes 3 parameters which are ("URl", "Username", "Password")


            //7th creating a statement reference
            Statement st = conn.createStatement();    // Here, we are creating our Statement Object!!
            ResultSet rs = st.executeQuery("SELECT * FROM emp");  //Execute - Update if this was an Update method;
            //here Resulset will capture the data being return

            while (rs.next()) {   //THis move the result cursor by one row and return a boolean value;
                // so it will return 1 row result, then go to the next line and return another one, till there is none and get out

                System.out.println(rs.getInt("ID") + " " + rs.getString("NAME")
                        + " " + rs.getString("LASTNAME") + " " + rs.getInt("SALARY"));



            }



            System.out.println("Connection Established!!");  // 4th, this is for when everything went well!!

            //5th, Before connecting everything, we need to import the Oracle Driver by adding a JAR Connection!!
            //Right CLick on the Java Project - Module settings - Scroll Down to Library - click on the + sign to add new jar file
            // - Select Java - put the name of the location of the app in the search - Select the JDBC connector Jar file - then apply

            //6th, Now we hit run to run our app- to see if we can connect to the database

            //7th but can be done any time before, Create a table in SQLPlus using the command panel of sql



            conn.close(); //TO close our connection


        }

        catch (Exception e) {

            e.printStackTrace();

        }


    }
}

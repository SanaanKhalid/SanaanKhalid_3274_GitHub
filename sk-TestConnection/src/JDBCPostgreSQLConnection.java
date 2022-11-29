/***********************************************************
 * 
 * @author Sanaan Khalid
 * Date: 11/29/2022
 *
 **********************************************************/
// package net.javaguides.postgresql.tutorial;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPostgreSQLConnection {
    // private final String url = "jdbc:postgresql://localhost/myDB";
	private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    // private final String password = "root";
    private final String password = "postgres";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Connected to the PostgreSQL server successfully.");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
        	System.out.println(e.getMessage());
        }

        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JDBCPostgreSQLConnection app = new JDBCPostgreSQLConnection();
       Connection conn = app.connect();
       int count = 0;
       
       try {
    	   Statement stat = conn.createStatement();
    	   stat.execute("drop table Test");
    	   stat.execute("CREATE TABLE Test( Name VARCHAR(20))");
    	   for(int i = 0; i < 10; i++) {
    		   stat.execute("INSERT INTO Test VALUES('Romeo')");
    	   }
    	   stat.execute("INSERT INTO TEST VALUES ('Romeo') ");
    	   ResultSet result = stat.executeQuery("SELECT * FROM Test");
    	   while(result.next()) {
    		   System.out.println(result.getString("Name"));
    		   count++;
    	   }
    	   
    	   System.out.println(count + "(rows)");
    			   
    	   
       }
       catch(SQLException e) {
    	   System.out.println(e.getMessage());
       }
    }
}
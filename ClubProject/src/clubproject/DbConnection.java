/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubproject;

import java.sql.*;


/**
 *
 * @author victor
 */
public class DbConnection {
   private Connection connection;
   private Statement statement;
   private ResultSet resultSet;
    
   private static final String hostName = "jdbc:mysql://127.0.0.1/apt3040";
   private static final String username = "root";
   private static final String password = "pass@1234";
    
    DbConnection() throws SQLException{
        intConnection();
    
    }
    
    public void insert(final PreparedStatement statement) throws SQLException {
        statement.execute();
        connection.close();
    }
    
    public ResultSet getData(final String query) throws SQLException{
        statement = connection.createStatement();
        statement.executeQuery(query);
        /**
         * close connection after obtaining data
         */
        connection.close();
        return statement.getResultSet();
    }

    private void intConnection() {
      try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(hostName, username, password);
           } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("Error" + ex);
          }
    }
}

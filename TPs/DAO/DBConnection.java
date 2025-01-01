package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
  private String url = "jdbc:mysql://localhost:3306/java_testing";
  private String dbuser = "root";
  private String dbpw = "";

  private static Connection con = null;

  public DBConnection() {
    if (con != null) return;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(url, dbuser, dbpw);
      System.out.println("Database Connection established!!");
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  public Connection getConnection() {
    return con;
  }
}

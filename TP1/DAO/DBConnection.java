package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
   public String url = "jdbc:mysql://localhost:3306/java_testing";
  public String dbuser = "root";
  public String dbpw = "";

  private static Connection con = null;

  public DBConnection() {
    if (con != null) return;
    try {
      Class.forName("org.postgresql.Driver");
      con = DriverManager.getConnection(url, dbuser, dbpw);
      System.out.println("DataBase Connection established!!");
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  public Connection getConnection() {
    return con;
  }
}
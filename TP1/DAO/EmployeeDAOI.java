package DAO;

import Models.Employee;

interface EmployeeDAOI {
  public String url = "jdbc:mysql://localhost:3306/java_db";
  public String dbuser = "root";
  public String dbpw = "";

  public boolean addEmployee(Employee em);

  public boolean deleteEmployee(int id);

  public boolean updateEmployee(int id, Employee em);
}

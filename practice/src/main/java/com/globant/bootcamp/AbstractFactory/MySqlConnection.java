package AbstractFactory;

public class MySqlConnection extends Connect{

  @Override
  public ConnectionType getConnection(String urlConnection, String user, String pass) {
    if ("MySQLAdmin".equals(user))
     {
      return new AdminMySql();
     }
     else {
      return new UserMySql();
     }
  }

}

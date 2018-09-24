package AbstractFactory;

public class OracleConnection extends Connect{
    @Override
  public ConnectionType getConnection(String urlConnection, String user, String pass) {
    if ("OracleAdmin".equals(user))
     {
      return new AdminOracle();
     }
     else {
      return new UserOracle();
     }
  
  }
   
}

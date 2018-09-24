package BuilderPattern;

//I created the class as abstract becouse if i don´t do it the compiler throws an error
public abstract class MySQLConnectionBuilder implements ConnectionBuilder{
   private Connect connect;

   public MySQLConnectionBuilder() {
     connect = new Connect();
   }

   @Override
   public void buildUser() {
     connect.setUser("MySQLUser");
   }
   
   @Override
   public void buildPass() {
   connect.setPass("MySQLPass");
   }
   
   @Override
   public void buildConn() {
    connect.setConn("MySQLConn");
   }

}

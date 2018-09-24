package BuilderPattern;

public class ConnectionDirector {
    private ConnectionBuilder connectionBuilder = null;

     public ConnectionDirector (ConnectionBuilder connectionBuilder) {    
     this.connectionBuilder = connectionBuilder;
    }

    public void constructConnection() {
    connectionBuilder.buildUser();
    connectionBuilder.buildPass();
    connectionBuilder.buildConn();
    }

    public Connect getConnection() {
     return connectionBuilder.getConnection();
    }
}

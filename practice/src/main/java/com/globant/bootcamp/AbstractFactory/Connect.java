package AbstractFactory;

    public abstract class Connect{
        public abstract ConnectionType getConnection(String urlConnection, String user, String pass);
    }

package AbstractFactory;

public abstract class AbstractConnection{
    
        public Connect getConnection(String urlConnection){
            if ("jdbc:mysql://localhost".equals(urlConnection)){
                return new MySqlConnection();
            }

            else {
                return new OracleConnection();
            }
        }
        
        
}

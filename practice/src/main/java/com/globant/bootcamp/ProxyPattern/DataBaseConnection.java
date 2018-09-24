package ProxyPattern;

import java.util.List;

public class DataBaseConnection implements DataBase {
    private ConnectionManager connectionManager;
    
    public void conn (List Data) {
      if (connectionManager.Connected()) {
         new Remote().conn(Data);
      }
      else {
        new MySqlDataBase().conn(Data);
      }
}
}

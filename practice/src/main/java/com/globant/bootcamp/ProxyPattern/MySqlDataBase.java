package ProxyPattern;

import java.util.List;

public class MySqlDataBase implements DataBase {
    public void conn (List Data){
      System.out.println("Connecting to MySQL DataBase...");
    }
}

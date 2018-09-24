package ProxyPattern;

import java.util.List;

public class Remote implements DataBase{
    public void conn(List Data) {
      System.out.println("Remote connecting ...");
    }
}

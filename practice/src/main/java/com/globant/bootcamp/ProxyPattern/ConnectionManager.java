package ProxyPattern;

public class ConnectionManager {
     private boolean connected;

     public ConnectionManager() {
     connected = false;
     }

     public void Connect() {
      connected = true;
     }

     public void Disconnect(){
      connected = false;
     }

     public boolean Connected() {
       return connected;
     }    
}

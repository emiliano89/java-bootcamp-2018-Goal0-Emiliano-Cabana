package BuilderPattern;

public class Connect {
   
      private String user;
      private String pass;
      private String conn;
      
        public String getUser() {
            return user;
        }


        public void setUser(String user) {
            this.user = user;
        }


        public String getPass() {
            return pass;
        }


        public void setPass(String pass) {
            this.pass = pass;
        }


        public String getConn() {
            return conn;
        }


        public void setConn(String conn) {
            this.conn = conn;
        }
    
  public String ConnectToString(){
   return "Connect to " + getConn() + ", user: " + getUser();
  }

}

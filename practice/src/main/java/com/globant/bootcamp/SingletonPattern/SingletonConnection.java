package SingletonPattern;

public class SingletonConnection {
    
    private String user;
    private String pass;
    private String db;
    private String url;
    private static SingletonConnection conn;
    
    
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

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static SingletonConnection getInstance(String user, String pass, String db, String url) {
        if (conn == null) {
            conn = new SingletonConnection(user, pass, db, url);
        }
        return conn;
    }
    
    private SingletonConnection(String user, String pass, String db, String url) {
        this.user = user;
        this.pass = pass;
        this.db = db;
        this.url = url;
    } 
}

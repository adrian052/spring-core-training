package proxy;

public class LazyInitDBConnection implements Connection{
    DbConnection realConection;

    public LazyInitDBConnection(){
        System.out.println("Lazy Init DB Conection has started.");
    }

    @Override
    public void connect(String user, String password) {
        if(realConection == null){
            realConection = new DbConnection();
        }
        realConection.connect(user,password);
        realConection.checkConnection();
    }
}

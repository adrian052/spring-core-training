package proxy;

import java.nio.file.AccessDeniedException;

public class AccessControlDBProxy implements Connection {
    private DbConnection dbConnection;

    public AccessControlDBProxy() {
        System.out.println("Init Access Control DB Connection Proxy");
        dbConnection = new DbConnection();
    }

    @Override
    public void connect(String user, String password)  {
        try {
            if (user.equals("admin") || user.equals("stakeholder")) {
                dbConnection.connect(user, password);
                dbConnection.checkConnection();
            } else {
                throw new AccessDeniedException("Access denied for user: " + user);
            }
        } catch (AccessDeniedException e) {
            e.printStackTrace();
        }
    }
}
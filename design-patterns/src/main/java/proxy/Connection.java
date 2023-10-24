package proxy;

import java.nio.file.AccessDeniedException;

public interface Connection {

    void connect(String user, String password);

}

package proxy;


import java.util.Map;

public class ProxyPattern {

    // TODO implement two proxy patterns
    // 1. Proxy with lazy initialization of DbConnection
    // 2. Proxy that rejects and throw AccessDeniedException for
    // all users except "admin" and "stakeholder" while connecting

    public static void main(String[] args) {
        //Lazy Initialization
        Connection lazyConection = new LazyInitDBConnection();
        System.out.println("Before call connect and init real connection");
        lazyConection.connect("admin","admin");

        System.out.println();
        //With access denied exception
        Connection accessConectionProxy = new AccessControlDBProxy();
        System.out.println("Before call connect");
        accessConectionProxy.connect("admin","admin");

        System.out.println();
        System.out.println("Try to connect with other credentials...");
        accessConectionProxy.connect("a_drian1","a_drian1");

    }
}

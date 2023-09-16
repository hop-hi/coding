package com.mh.rmi;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SampleClient {
     public static void main(String[] args) {
 
        String host = (args.length < 1) ? "192.168.0.2" : args[0];
        // String host = (args.length < 1) ? "localhost" : args[0];
        try {
            // Rmi registry에 서버 IP, port를 설정한다.
            Registry registry = LocateRegistry.getRegistry(host);
            
            // Rmi registry.lookup을 통해 SampleServerName이름을 찾아 stub을 가져온다.
            SampleInterface stub = (SampleInterface) registry.lookup("SampleServerName");
            
            // server의 함수를 호출한다.
            String ResultEcho   = stub.Echo("Hello World");
            int    ResultAdd    = stub.Add(125, 175);
            
            System.out.println("Client : I receive your result  : " + ResultEcho);
            System.out.println("Client : I receive your result   : " + ResultAdd);            
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

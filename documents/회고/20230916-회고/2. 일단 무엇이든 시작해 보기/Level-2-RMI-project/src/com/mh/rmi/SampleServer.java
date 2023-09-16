package com.mh.rmi;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class SampleServer extends UnicastRemoteObject  implements SampleInterface {
        
     protected SampleServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 함수 구현
     public String Echo(String Msg) {
    	 System.out.println("Server : I will return your message - " + Msg);
         return Msg;
     }
 
     public int Add(int num1, int num2) {
    	 System.out.println("Server : I will calculate your number");
         int sum = num1 + num2;
         return sum;
     }
 
     // 서버 실행 메인
     public static void main(String args[]) {
        
         try {
                         
             // 원격 객체를 export하여 통시하는 stub를 생성 및 접속할 수 있게끔 한다.
        	 LocateRegistry.createRegistry(1099);
        	 SampleServer stub = new SampleServer();
        	 Naming.bind("SampleServerName", stub);
        	            
             // 서버 준비 완료
             System.err.println("Server ready");
         } catch (Exception e) {
             System.err.println("Server exception: " + e.toString());
             e.printStackTrace();
         }
     }
 }
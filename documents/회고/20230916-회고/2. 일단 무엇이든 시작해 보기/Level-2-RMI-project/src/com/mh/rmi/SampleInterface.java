package com.mh.rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SampleInterface extends Remote
 {
     int  Add(int num1, int num2)  throws RemoteException;
     String  Echo(String Msg)  throws RemoteException;    
 }
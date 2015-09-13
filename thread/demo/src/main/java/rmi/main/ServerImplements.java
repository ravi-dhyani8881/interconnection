package rmi.main;

import java.rmi.server.UnicastRemoteObject;

public class ServerImplements extends UnicastRemoteObject implements RemoteInterface
 {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public ServerImplements()throws Exception
 {
 super();
 }
 public int add(int x,int y)
 {
 return (x+y);
 }
}
package rmi.main;

import java.rmi.*;

public interface RemoteInterface extends Remote
{
 public int add(int x,int y)throws Exception;
}
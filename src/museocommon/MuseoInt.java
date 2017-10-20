/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museocommon;

import java.rmi.Remote;
import java.util.List;
import java.util.Map;

/**
 *
 * @author pinedo
 */
public interface MuseoInt extends Remote {

    public String decirHola(String nombre) throws java.rmi.RemoteException;

    public List<DataUser> auth(String user, String password) throws java.rmi.RemoteException;

    public List<DataClient> add(int user_id, String name, int age) throws java.rmi.RemoteException;

    public boolean modify(int index, String status) throws java.rmi.RemoteException;

    public Map<String, Integer> getReport() throws java.rmi.RemoteException;
    
    public List<DataClient> getAllClient() throws java.rmi.RemoteException;
}

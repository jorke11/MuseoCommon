/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museocommon;

import java.io.Serializable;

/**
 *
 * @author pinedo
 */
public class DataUser implements Serializable{
    public int id;
    public int role_id;
    public String user;
    public String password;

    public DataUser(int id, int role_id, String user, String password) {
        this.id = id;
        this.role_id = role_id;
        this.user = user;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getUser() {
        return user;
    }

    public void setName(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

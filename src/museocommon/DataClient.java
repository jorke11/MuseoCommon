/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museocommon;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pinedo
 */
public class DataClient implements Serializable {

    public int id;
    public int user_id;
    public String name;
    public int age;
    public String status;
    public int valor;

    public String dateInput, dateOutput;

    public DataClient(int id, int user_id, String name, int age, int valor, String status, String dateInput) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.age = age;
        this.status = status;
        this.valor = valor;
        this.dateInput = dateInput;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getdateInput() {
        return dateInput;
    }

    public void setdateInput(String dateInput) {
        this.dateInput = dateInput;
    }

    public String getdateOutput() {
        return dateOutput;
    }

    public void setdateOutput(String dateOutput) {
        this.dateOutput = dateOutput;
    }

}

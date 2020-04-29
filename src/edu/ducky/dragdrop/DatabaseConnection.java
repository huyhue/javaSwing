/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ducky.dragdrop;

/**
 *
 * @author ASUS
 */
public class DatabaseConnection {
    public String connectDatabase(String ipAddress, String port, String service, String user,String passwprd){
        try {
            //hocj cach ket noi voi database
            
            return "Connect successful";
        } catch (Exception e) {
            return "Error: "+e.toString();
        }
    }
}

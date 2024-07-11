/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexão;

/**
 *
 * @author elias
 */
public class java {;
    private static final String url = "jdbc:mysql://localhost:3306/exemplobd";
    private static final String user = "root";
    private static final String password = "root";
    
    private static Connection conn;
    
    public static Connection getconexao(){
        
        if(conn == null){
            conn = DriveManager.getConection(url ,user, password;
        }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Kurniawan
 */
public class Koneksi {
        private static Connection KoneksiDatabase;
        public static Connection koneksiDB()
        {
            try{
                
                String url = "jdbc:mysql://localhost/pbo";
                String user = "root";
                String pw  = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                KoneksiDatabase = (Connection) DriverManager.getConnection(url,user,pw);
                System.out.println("Connected");
                
            } catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Tidak ada koneksi","Error",
                JOptionPane.INFORMATION_MESSAGE);
                System.err.println(e.getMessage());
                System.exit(0);
            }
            
            return KoneksiDatabase;
            
        }
}

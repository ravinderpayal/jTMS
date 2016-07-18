/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package online.test.cms;

import java.awt.Button;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.TextArea;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Ravinder Payal
 */
public class DB {
    Connection conn;
    Statement stmt;
     private javax.swing.JDialog jDialogDB;
    boolean Connect(){
        System.out.println("Hello is there anything");
           try{
    System.out.println(Class.forName("java.sql.Driver"));
               String database = "jdbc:mysql://localhost:3306/ONLINE_TEST";
               conn = DriverManager.getConnection(database, "root", "");
               stmt = conn.createStatement();
               return true;
                 }
           catch(Exception e){
                this.showMessage("Problem in makiing connection with sql server.\t\nSQL server may be down.\nThe following exception was occured\n\n"+e);
        
               return false;
               //jDialog5.setShape();
           }
    }
    
    ResultSet executeSql(String sql){
        try {
           ResultSet rs = stmt.executeQuery(sql);
            //rs.next();
            return rs;
        }
        catch(Exception e){
        this.showMessage("Problem in executing the following sql please check this sql command \t"+sql+"\n\nThe following exception was occured\n\n"+e);
               return null;
        }
    }
        void showMessage(String m){
        javax.swing.JDialog jDialogDB = new javax.swing.JDialog();
        TextArea ta=new TextArea(m);
        ta.setEditable(false);
        ta.setBounds(0, 0, 500, 100);
        jDialogDB.add(ta);
        
       /* Button btn=new Button("OK");
        btn.setSize(10,10);
        
        btn.setBackground(Color.green);
               jDialogDB.add(btn);*/
               jDialogDB.setBounds(150, 150,500,500);
               jDialogDB.setTitle("Error Error");
              
               jDialogDB.setVisible(true);
    }
  /* ResultSet executeSQL(){
       return 1;
//       byte a=0x11F;
 //  return a;
   }*/
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package online.test.cms;

import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;
import java.security.MessageDigest;

/**
 *
 * @author SMS1
 */
public class Authenticate extends  DB{
    void Authenticate(){
        this.Connect();
    }
    boolean AdminLogin(String u,String p){
       try{
           
          /* byte input[]="hello".getBytes();
//           byte input=Byte.parseByte("f");
           String i = "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
           System.out.println(i);
           System.out.println(i);
           
           System.out.println(input);
           System.out.println(i);
           System.out.println(i);*/
          // ASCIIReader a=new ASCIIReader();
          // char c[]=new char[1];

          // a.read(c);
//           input.
       /* MessageDigest m=MessageDigest.getInstance("md5");*/
        //byte b=
             //   m.digest(input);
        
       // for(int i=0;i<b.length;i++)System.out.println(b[i]);
         //  System.out.println(input);
       }
       catch(Exception e){
           System.out.println(e);
       }
        
        return false;
    }
}

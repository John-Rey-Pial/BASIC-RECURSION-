/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Admin
 */
public class Proj3 {
    public String changeXY (String str){
     String list = "";
     int i = 0;
        if(!str.contains("x")){
            return str;
        }

    if(str.charAt(i) ==('x')){
        list="y";
        i = i+1;
        return list +changeXY (str.substring(i));
    }
    
    return
       str.charAt(i)+changeXY(str.substring(i+1))     ;
       
   
        }
    public static void main(String[] args) {
        Proj3 list = new Proj3 ();
        System.out.println(list.changeXY("xxxxcodex"));
    }
}

       
        
        
    
    


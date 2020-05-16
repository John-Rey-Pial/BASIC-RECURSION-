/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Arrays;




/**
 *
 * @author Admin
 */
public class Proj4 {
    
  public boolean ispalindrome (char a[], int n){
      
      if(n==1){
          return true;
      }
      if(n==2 && a[0]==a[a.length-1]){
          return true;
      }
      
      if(a[0]!=a[a.length-1]){
          return false;
      }
      
     String list = "";
     for (int i =0; i<a.length; i++){
         list += a[i];
     }
     String str = list.substring(1,list.length()-1);
     char b[]= str.toCharArray();
     return ispalindrome (b, b.length);
      
 
}
    public static void main(String[] args) {
        Proj4 list = new Proj4();
        char a[]= {'t','e', 'n', 'e', 't'};
        
        System.out.println(list.ispalindrome(a,a.length));
    }
  
}

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
public class Proj5 {

    public String pairStar(String str) {
       
        String finalist="";
       if(str.length()==1 || str.length()==0){
        return finalist+str;
       }
       finalist+=str.charAt(0);
       if(str.charAt(0)==str.charAt(1)){
       finalist+= "*";
       }
       return finalist+pairStar(str.substring(1));
    }

    public static void main(String[] args) {
        Proj5 list = new Proj5();
        System.out.println(list.pairStar("hello"));
    }
}

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
public class Proj1 {
    public void descending(int n){
        if(n <=1){
        System.out.println(n);
        }
       if(n >1){
           System.out.print(n);
           descending(n-1);
        }
       
    }
    public static void main(String[] args) {
       Proj1 list = new Proj1();
       list.descending(10);
       
        
    }
}

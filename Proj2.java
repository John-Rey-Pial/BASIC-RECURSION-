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
public class Proj2 {

    public int exp(int x, int m) {
        if (m == 1) {
            return x;
        }
        else if (m==0){
            return 1;
        }
        return x *(exp(x,m-1));
    }

    public static void main(String[] args) {
        Proj2 list = new Proj2();
        System.out.println(list.exp(2, 4));
    }
}

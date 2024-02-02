/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evenorodd.java;

/**
 *
 * @author OWNER
 */
import java.util.*;
public class EvenOrOddJava 
{

    public static void main(String args[]) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number:");
        n=sc.nextInt();
        if(n%2==0)
            System.out.println(n+" is EVEN Number");
        else
            System.out.println(n+" is ODD Number");
    }
}

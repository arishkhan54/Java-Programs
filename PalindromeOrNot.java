/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromeornot;

import java.util.*;

/**
 *
 * @author OWNER
 */
public class PalindromeOrNot
{
    public static void main(String[] args)
    {
            String str1;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String :");
            str1=sc.next();
            StringBuffer str2=new StringBuffer(str1);
            str2.reverse();
            String str3=new String(str2);
                if(str1.equals(str3))
                {
                    System.out.println("The Given String is Palindrome");
                }
                else
                {
                    System.out.println("The Given String is not Palindrome");
                }
    }
}

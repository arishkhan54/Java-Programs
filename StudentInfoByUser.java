/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentinfobyuser.java;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class StudentInfoByUser {

    static class Detail
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int rno;
            void get()
            {
                System.out.println("Enter Student Name And Roll Number:");
                name=sc.next();
                rno=sc.nextInt();
            }
            void put()
            {
                System.out.println("Student Name is "+name);
                System.out.println("Student Roll Number is "+rno);
            }
    }
    public static void main(String[] args)
    {
        Detail d1=new Detail();
        d1.get();
        d1.put();
    }
}

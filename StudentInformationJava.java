/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentinformation.java;

/**
 *
 * @author OWNER
 */
public class StudentInformationJava 
{
   static class Information
 { 
    int rno;
    String name;
           void get()
           {
               rno=7;
               name="Umesh";
           }
           void put()
           {
               System.out.println("Student Roll Number is "+rno);
               System.out.println("Student Name is "+name);
           }
    
 }

    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    { 
     Information obj=new Information();
     obj.get();
     obj.put();
     }
}



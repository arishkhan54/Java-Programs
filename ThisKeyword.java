/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thiskeyword;

/**
 *
 * @author OWNER
 */
class Students
{
    int rno;
    String name;
    void Get(int rno,String name)
    {
        this.rno=rno;
        this.name=name;
    }
    void Show()
    {
        System.out.println("Roll Number="+rno);
        System.out.println("Name is "+name);
    }
}
public class ThisKeyword 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Students s1=new Students();
        s1.Get(07,"Arish");
        s1.Show();
    }
    
}

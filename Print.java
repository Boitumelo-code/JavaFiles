/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysDev2022;

/**
 *
 * @author user
 */
public class Print {
    public static void main(String[] args){
        
      //uding priintln
      String myname = "Boitumelo.";
      String myaddress = "53 Geelvink Avenue Kempton Park";
       //System.out.println(myname + " " + myaddress);
       //System.out.println(myname + " " + myaddress);
       
     System.out.print(myname+ "" + myaddress);
     //System.out.print(myname+ "" + myaddress);
           
       //Using printf
       int a = 17;
       int b = 6;
       float c = (float)a/b;
       System.out.println();
      // System.out.printf("Dividing %d by %d = %.2f", a, b, c);
       
        
       String empName = "Danny Joseph";
       int empId = 1001;
       float empSalary = 4500.684f;
       System.out.printf("%s with Id number %d has a startup salary of  R%.2f", empName, empId, empSalary);
        
        
        
        
   
    
    
    
    }
}

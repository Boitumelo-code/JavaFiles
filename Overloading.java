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
public class Overloading { 
    public static void main(String[] args){
        {
            
         Overloading ff = new Overloading();
         
         
           ff.Add(12,7);
          System.out.println(ff.Add(8, 4));
          System.out.println(ff.Add(11, 9, 10)); 
          System.out.println(ff.Add(24, 6, 7));  
            
            
        }       
      public int Add(int a, int b)
    
   
      {
        return a + b;
      
          
         
         
      }

public float Add(float a, float b, float c)
{
 return ((a + b * c));   
    
    
}



  public int calculate()  
    
  {
int a = 2;
int b = 3;
int c = a * b;
return c;
      
      
      
  }  
    
    
    
    
    
    
    
 

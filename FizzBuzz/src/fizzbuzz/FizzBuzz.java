/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Nate Dix - CHANGE TO YOUR NAME
 * @class AP CSA
 */
public class FizzBuzz 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        for(int i =1;i<101;i++)
        {
            if(i%3==0&&i%5==0){
            System.out.println("FizzBuzz");//detects if divisible by 3&5
            }else if(i%3==0){
                System.out.println("Fizz");//detects if divisible by 3
            }else if(i%5==0){
                System.out.println("Buzz");//detects if divisible by 5
            }else{
                System.out.println(i);
            }
        }
    }
    
}

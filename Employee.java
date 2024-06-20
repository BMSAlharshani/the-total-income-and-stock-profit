/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work;

/**
 *
 * @author mczo4
 */
public class Employee {
   private int Salary ; 
   private int bonus ;
   public Employee(int Salary , int bonus){
       this.Salary = Salary; 
       this.bonus = bonus ; 
       
   }
    public void printtotalIncome(){
        System.out.println(Salary+bonus);
        
       
    }
    public int getSalary (){
        return Salary ; 
    }
    public int getBonus(){
        return bonus; 
    }
}

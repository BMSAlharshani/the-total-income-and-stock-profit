/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work;

/**
 *
 * @author mczo4
 */
public class CEO extends Employee {
    private int Stock_profit; 
    public CEO (int Salary , int bonus , int Stock_profit){
       
        super(Salary , bonus) ; 
         this.Stock_profit =  Stock_profit;
    }
    public void printtotalIncome(){
        System.out.println(getSalary() + getBonus() + Stock_profit);
    }
    public int getStock_profit(){
        return  Stock_profit;
    }
}

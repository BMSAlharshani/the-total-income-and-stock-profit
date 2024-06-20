/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package work;

/**
 *
 * @author mczo4
 */
public class Work {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp = new Employee(1000, 450) ; 
        emp.printtotalIncome();
        CEO ceo = new CEO(1000, 10000 , 100000);
        ceo.getStock_profit();
        ceo.printtotalIncome();
        System.out.println(ceo.getStock_profit());
        
    }
    
}

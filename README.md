--Employee.java--
Explanation:
Package Declaration: The class belongs to the work package.
Class Definition: The Employee class has two private attributes: Salary and bonus.
Constructor: The constructor initializes Salary and bonus when an Employee object is created.
Methods:
printtotalIncome(): Prints the total income (sum of Salary and bonus).
getSalary(): Returns the Salary.
getBonus(): Returns the bonus.
--Work.java--
Explanation:
Package Declaration: The class belongs to the work package.
Main Method: The entry point of the application.
Creates an Employee object with a salary of 1000 and a bonus of 450, then prints the total income.
Creates a CEO object with a salary of 1000, a bonus of 10000, and a stock profit of 100000.
Calls methods on the CEO object to get the stock profit, print the total income, and print the stock profit.
--CEO.java--
Explanation:
Package Declaration: The class belongs to the work package.
Class Definition: The CEO class extends the Employee class, adding an additional attribute Stock_profit.
Constructor: The constructor initializes the Salary, bonus, and Stock_profit. It calls the superclass (Employee) constructor to initialize Salary and bonus.
Methods:
printtotalIncome(): Prints the total income (sum of Salary, bonus, and Stock_profit).
getStock_profit(): Returns the Stock_profit.
--Summary--
The Employee class represents an employee with a salary and bonus.
The CEO class extends the Employee class, adding a stock profit attribute.
The Work class demonstrates the use of Employee and CEO classes by creating instances and invoking their methods to print the total income and stock profit. ​​

package EmployeeSystem;

import javax.swing.*;
import java.util.ArrayList;


public class EmployeeGestion{
    //Attributes
    private ArrayList<Employee> employees;
    //Constructors
    public EmployeeGestion(){
        this.employees = new ArrayList<>();
    }
    //Methods
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public boolean removeEmployees(int id){
        return this.employees.removeIf(employee -> employee.getIdEmployee() == id);
    }


    public Object showEmployees(){
        if (this.employees.isEmpty()){
            System.out.println("Theres is not employees currently!");
        } else {
            for (Employee employee : this.employees){
                JOptionPane.showMessageDialog(null,"Current employees: "+ " Id: " + employee.getIdEmployee() + " Name: " + employee.getName()
                        + "  Age: " + employee.getAge() + " Salary: " + employee.getSalary());
            }
            JOptionPane.showMessageDialog(null,"No hay mas empleados");
        }
        return null;

    }
    //Setters and getters

    //ToString
}
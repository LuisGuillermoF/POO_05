package EmployeeSystem;

import EmployeeSystem.Employee;
import EmployeeSystem.EmployeeGestion;
import EmployeeSystem.PermanentEmployee;


import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

         Employee employee = new Employee();
         EmployeeGestion employeeGestion = new EmployeeGestion();
         String option = "0";

         do {
             try {
                 option =JOptionPane.showInputDialog("""
                         1. Add a employee.
                         2. Remove a employee.
                         3. Show employees.
                        4. Exit.
                         """);

                 switch (option){
                     case "1":
                         String name = JOptionPane.showInputDialog("Digite su nombre");
                         String age = JOptionPane.showInputDialog("Digite su edad");
                         int newAge = Integer.parseInt(age);

                         String id = JOptionPane.showInputDialog("Digite su id");
                         int newId = Integer.parseInt(id);

                         String salary = JOptionPane.showInputDialog("Digite su salario");
                         double newSalary = Double.parseDouble(salary);

                         employee = new Employee(name,newAge,newId,newSalary);
                         JOptionPane.showMessageDialog(null,"El empleado fue agregado exitosamente");
                         employeeGestion.addEmployee(employee);
                         break;
                     case "2":
                         String remove = JOptionPane.showInputDialog("Digite el id del empelado a eliminar");
                         int empleadoRemove = Integer.parseInt(remove);
                          newId = empleadoRemove;
                         if (employeeGestion.removeEmployees(newId)){
                             JOptionPane.showMessageDialog(null,"El empleado fue eliminado correctamente");

                         } else {
                             JOptionPane.showMessageDialog(null,"EL id ingresado no coincide");
                         }
                         break;
                     case "3":
                         JOptionPane.showMessageDialog(null,employeeGestion.showEmployees());
                         break;
                     case "4":
                         JOptionPane.showMessageDialog(null,"Gracias por utilizar el sistema Cerrando.....");
                         break;
                 }

             } catch (Exception e){
                 JOptionPane.showMessageDialog(null,"Se produjo un error");
             }
         } while (!option.equals("4"));

    }
}

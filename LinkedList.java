/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Scanner;

/**
 *
 * @author ANSHUL
 */
public class LinkedList 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Employee e1 = new Employee("Anshul", "Prasad", 11);
        Employee e2 = new Employee("Ria", "Singh", 56);
        Employee e3 = new Employee("Drishti", "Singh", 26);
        //Employee e4 = new Employee("Gautam", "B", 27);
        Employee e5 = new Employee("Aryan", "Gupta", 16);

        EmployeeLinkedList list = new EmployeeLinkedList();
        
        System.out.println("\n" + list.isEmpty());
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(new Employee ("Gautam", "B", 27));
        list.addToFront(e5);
        
        list.printList();
        
        System.out.println("\n" + list.getSize());
        
        list.removeFromFront();
        list.printList();
        
        System.out.println("\n" + list.getSize());
    }
    
    
}

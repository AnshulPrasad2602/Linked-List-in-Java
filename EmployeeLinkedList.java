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
public class EmployeeLinkedList
{
    Scanner sc = new Scanner (System.in);
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public EmployeeLinkedList() 
    {
        this.head = null;
        this.tail = null;
    }
    
    public void addToFront(Employee employee) 
    {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }
    
    public void add (Employee emp)
    {
        EmployeeNode node = new EmployeeNode (emp);
        
        if (isEmpty())
        {
            head = tail = node;
            size++;
        }
        else
        {
            tail.setNext(node);
            tail = tail.getNext();
            size++;
        }
    }
    
    public EmployeeNode removeFromFront() 
    {
        if (isEmpty()) 
        {
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }
    
    public int getSize() 
    {
        return size;
    }

    public boolean isEmpty()
    {
        return head == null;
    }
    
    public void printList()
    {
        System.out.println("List ->\n");
        {
            for (EmployeeNode i = head; i != null; i = i.getNext())
            {
                System.out.println("" + i.toString());
            }
        }
    }
}

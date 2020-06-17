/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author ANSHUL
 */
public class EmployeeNode 
{
    private Employee emp;
    private EmployeeNode next;

    public EmployeeNode(Employee emp) 
    {
        this.emp = emp;
    }

    public Employee getEmp()
    {
        return emp;
    }

    public void setEmp(Employee emp)
    {
        this.emp = emp;
    }

    public EmployeeNode getNext() 
    {
        return next;
    }

    public void setNext(EmployeeNode next)
    {
        this.next = next;
    }

    @Override
    public String toString() {
        return emp.toString();
    }
    
    
}

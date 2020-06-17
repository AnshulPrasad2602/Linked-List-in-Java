/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Objects;

/**
 *
 * @author ANSHUL
 */
public class Employee 
{
    private String FirstName;
    private String LastName;
    private int id;

    public Employee(String FirstName, String LastName, int id) 
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.id = id;
    }

    public String getFirstName() 
    {
        return FirstName;
    }

    public void setFirstName(String FirstName) 
    {
        this.FirstName = FirstName;
    }

    public String getLastName()
    {
        return LastName;
    }

    public void setLastName(String LastName)
    {
        this.LastName = LastName;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString() 
    {
        return "\nEmployee\n" + "FirstName = " + FirstName + "\nLastName = " + LastName + "\nid = " + id ;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.FirstName);
        hash = 17 * hash + Objects.hashCode(this.LastName);
        hash = 17 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.FirstName, other.FirstName)) {
            return false;
        }
        if (!Objects.equals(this.LastName, other.LastName)) {
            return false;
        }
        return true;
    }
}

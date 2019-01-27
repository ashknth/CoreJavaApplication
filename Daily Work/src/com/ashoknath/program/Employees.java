package com.ashoknath.program;

import java.util.Scanner;

/**
 * Created by ashoknath on 1/26/19.
 */
public class Employees {
    int id;
    String firstname;
    String lastname;
    String address;
    String email;

    public Employees(int id, String firstname, String lastname, String address, String email)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
    }

public void display()
{

    System.out.println("ID:"+id+"\nFirstname:"+firstname+"\nLastname::"+lastname+"\nAddress::"+address+"\nEmail::"+email);
}

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the ID of Employee::");
        int id=sc.nextInt();


        System.out.println("Enter the  First name of Employee::");
        String firstname=sc.next();
        sc.nextLine();


        System.out.println("Enter the Last name of Employee::");
        String lastname=sc.nextLine();




        System.out.println("Enter the address of Employee::");
        String  address=sc.nextLine();

        System.out.println("Enter the  email address of Employee::");
        String  email=sc.nextLine();



        Employees employees = new Employees(id,firstname,lastname,address,email);
         employees.display();

    }
}

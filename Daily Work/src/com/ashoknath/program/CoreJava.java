package com.ashoknath.program;

/**
 * Created by ashoknath on 1/25/19.
 */

//All about constructor.


public class CoreJava {
    public CoreJava()
    {
        System.out.println("This is a default constructor.");
    }

    public CoreJava(int a,int b)
    {
        System.out.println("This is a 2-argument constructor.");
    }

    public CoreJava(char c)
    {
        System.out.println("This is a constructor with character value ");
    }

public CoreJava(float f)
{
    System.out.println("This is a constructor with float value.");

}
public CoreJava(String s)
{
    System.out.println("This is a constructor with string value.");
}

    public static void main(String[] args)
    {
        CoreJava corejava=new CoreJava();
        CoreJava corejava1=new CoreJava(2,3);
        CoreJava coreJava2= new CoreJava('A');
        CoreJava coreJava3=new CoreJava(100.00f);
        CoreJava coreJava4=new CoreJava("Ashok");


    }
}

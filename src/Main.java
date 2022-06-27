/*

Q1.

JRE- java Runtime Environment --> It is a Class file opener.And only JRE can run any
java class. JRE=JVM+Java librery classes;

JVM- JAVA VIRTUAL MACHINE --> it is part of JRE.

JDK- JAVA DEVELOPEMENT KIT --> It is a overall software of java program By the use of
JDK we can compile any JAVA file as well as can cun any java Class.

*/
//Q2.
public class Main {

    public static void main(String[] args) {
        printMonths("DEC");
    }
    static void printMonths(String month)
    {
        if(month=="JAN")
        {
            System.out.println("This is the 1st Month of the Year January");
        }
        else if(month=="FEB")
        {
            System.out.println("This is the 2nd Month of the Year February");
        }
        else if(month=="MAR")
        {
            System.out.println("This is the 3rd Month of the Year March");
        }
        else if(month=="APR")
        {
            System.out.println("This is the 4th Month of the Year April");
        }
        else if(month=="MAY")
        {
            System.out.println("This is the 5th Month of the Year May");
        }
        else if(month=="JUN")
        {
            System.out.println("This is the 6th Month of the Year June");
        }
        else if(month=="JUL")
        {
            System.out.println("This is the 7th Month of the Year July");
        }
        else if(month=="AUG")
        {
            System.out.println("This is the 8th Month of the Year August");
        }
        else if(month=="SEPT")
        {
            System.out.println("This is the 9th Month of the Year September");
        }
        else if(month=="OCT")
        {
            System.out.println("This is the 10th Month of the Year October");
        }
        else if(month=="NOV")
        {
            System.out.println("This is the 11th Month of the Year November");
        }
        else if(month=="DEC")
        {
            System.out.println("This is the 12th Month of the Year December");
        }
    }
}

/*
Q4.

Static Variable
A static variable is also called a class variable and is common across the objects of the class and this variable
can be accessed using class name as well.

Non-Static Variable
Any variable of a class which is not static is called non-static variable or an instance variable.

 */
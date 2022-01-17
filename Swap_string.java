package com.logic;

public class Swap_string

{
    public static void main(String [] args)
    {
        String fname = "hawk";
        String lname = "eye";
//      swapping using the 3rd string
        System.out.println("before swap\n"+fname+"\n"+lname);
        String temp;
        temp = fname;
        fname = lname;
        lname = temp;
        System.out.println("after swap\n"+fname+"\n"+lname);
        
//      swapping without using the 3rd string
        System.out.println("before swap\n"+fname+"\n"+lname);
        fname = fname + lname;
        lname = fname.substring(0,fname.length()-lname.length());
        fname = fname.substring(lname.length());
        System.out.println("after swap\n"+fname+"\n"+lname);
    }
}

package com.logic;

import java.util.Random;

import java.util.Scanner;

public class RPCGame
{
    public static String userChoice(String user_choice)
    {
        user_choice.toLowerCase();
        if(user_choice.equals("rock"))
        {
            user_choice = "rock";
        }
        else if(user_choice.equals("paper"))
        {
            user_choice = "paper";
        }
        else if(user_choice.equals("scissor"))
        {
            user_choice = "scissor";
        }
        else
        {
            System.exit(-1);
        }
        return user_choice;
    }
    public static String computerChoice(int computer_int)
    {
        String computer_choice = "";
        if(computer_int==1)
        {
            computer_choice = "rock";
        }
        else if(computer_int==2)
        {
            computer_choice = "paper";
        }
        else if(computer_int==3)
        {
            computer_choice = "scissor";
        }
        return computer_choice;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any one\nROCK\nPAPER\nSCISSOR");
        String user_choice = sc.nextLine();
        Random generate = new Random();
        int computer_int = generate.nextInt(3)+1;
        String uc = userChoice(user_choice);
        System.out.println("user has chosen\n"+uc);
        String cc = computerChoice(computer_int);
        System.out.println("computer has chosen\n"+cc);
        if(uc.equals(cc))
        {
            System.out.println("game has been tied");
        }
        if(uc.equals("rock"))
        {
            if(cc.equals("paper"))
            {
                System.out.println("computer has won the game");
            }
            else if(cc.equals("scissor"))
            {
                System.out.println("user has won the game");
            }
        }
        if(uc.equals("paper"))
        {
            if(cc.equals("rock"))
            {
                System.out.println("user has won the game");
            }
            else if(cc.equals("scissor"))
            {
                System.out.println("computer has won the game");
            }
        }
        if(uc.equals("scissor"))
        {
            if(cc.equals("rock"))
            {
                System.out.println("computer has won the game");
            }
            else if(cc.equals("paper"))
            {
                System.out.println("user has won the game");
            }
        }
        sc.close();
    }
}

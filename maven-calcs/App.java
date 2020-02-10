package com.calcs.maven_calcs;

import java.util.*;
public class App
{
static int Addition(int num1,int num2)
 {
  return num1+num2;
 }
 static int Subtraction(int num1,int num2)
 {
  return num1-num2;
 }
 static int Multiplication(int num1,int num2)
 {
  return num1*num2;
 }
 static int Division(int num1,int num2)
 {
  if(num2!=0)
  {
   return num1+num2;
  }
  else
  {
   return 0;
  }
 }
 public static void main(String[]args)
 {
 int number1,number2,choice;
 String s="T";
 Scanner scan=new Scanner(System.in);
 
 while(s=="T")
 {
  System.out.println("Menu");
  System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
  System.out.println("Enter your choice");
  choice=scan.nextInt();
  System.out.println("Enter number1");
  number1=scan.nextInt();
  System.out.println("Enter number2");
  number2=scan.nextInt();
  switch(choice)
  {
   case 1:System.out.println("Addition of"+number1+"and"+number2+"is"+Addition(number1,number2));
          break;
   case 2:System.out.println("Subtraction of"+number1+"and"+number2+"is"+Subtraction(number1,number2));
          break;
   case 3:System.out.println("Multiplication of"+number1+"and"+number2+"is"+Multiplication(number1,number2));
          break;
   case 4:System.out.println("Division of"+number1+"and"+number2+"is"+Division(number1,number2));
          break;
   default:
         System.out.println("Invalid choice");
  }
  System.out.println("Do you want to continue(y/n)");
  s=scan.next();
  }
}
}
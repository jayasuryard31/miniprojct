package FuncMainPack;

import java.util.Scanner;

import FuncPack.FuncClass;

public class FuncMain {public static void main(String[] args){

@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
while(true) {
System.out.println("Please enter 1. Factorial\n" +
"2. SumUptoN\n" +
"3. EvenOrOdd");

int choice = sc.nextInt();
FuncClass a = new FuncClass();
System.out.println("Please enter the number");

int x=sc.nextInt();

switch(choice)
{
case 1 :
System.out.println("\n Factorial is "+a.Factorial(x));
break;
case 2 :
System.out.println("\n SumUptoN is "+a.SumUptoN(x));
break;
case 3 :
System.out.println("\n EvenOrOdd is "+a.EvenOrOdd(x));
break;
default : System.exit(0);
}
}
}
}
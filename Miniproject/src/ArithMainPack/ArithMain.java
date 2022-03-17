package ArithMainPack;
import java.util.Scanner;

import ArithPack.ArithClass;

public class ArithMain {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

while(true) {
System.out.println("Please enter two nos to do arithmatic operaions : ");

int x=sc.nextInt();
int y=sc.nextInt();

System.out.println("---- MENU ---- :\n1 - Add\n"+ "2 - Sub\n"+ "3 - Mul\n"+"4 - Div\n"+"5 - Mod\n"+"6 - Exit");

System.out.println("Enter your choice : ");

int choice = sc.nextInt();
ArithClass a = new ArithClass();

switch(choice)
{
case 1 :
System.out.println("\nSum is : "+a.Add(x,y));
break;
case 2 :
System.out.println("\nDifference is : "+a.Sub(x,y));
break;
case 3 :
System.out.println("\nMultiplication is : "+a.Mul(x,y));
break;
case 4 :
System.out.println("\nDivision is : "+a.Div(x,y));
break;
case 5 :
System.out.println("\nMod Division is : "+a.ModDiv(x,y));
break;
case 6 :
System.exit(0);
default:
System.out.println("Please Enter A Valid Choice !!!");
break;
}
}
}
}
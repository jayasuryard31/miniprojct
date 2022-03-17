package RelateMainPack;
import java.util.Scanner;

import RelatePack.RelateClass;

public class RelateMain {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

while(true) {
System.out.println("Please enter two nos to do relational operaions : ");

int x=sc.nextInt();
int y=sc.nextInt();

System.out.println("---- MENU ---- :\n1 - Check Greater\n"+"2 - Check Smaller\n"+"3 - Check Equal\n"+"4 - Exit");

System.out.println("Enter your choice : ");

int choice = sc.nextInt();
RelateClass r = new RelateClass();

switch(choice)
{
case 1 :
if (r.CheckGreater(x,y)==-1) {
System.out.println("Both Are Equal !!!");
}
else {
System.out.println("\nGreater of two is : "+r.CheckGreater(x,y));
}
break;
case 2 :
if (r.CheckSmaller(x,y)==-1) {
System.out.println("Both Are Equal !!!");
}
else {
System.out.println("\nGreater of two is : "+r.CheckSmaller(x,y));
}
break;
case 3 :
if (r.CheckEqual(x,y)==0) {
System.out.println("\nNumbers are Equal !!!\n");
}
else {
System.out.println("\nNumbers are NOT Equal !!!\n");
}
break;
case 4 :
System.out.println("\nYou Have Closed The Relational Class !!!");
System.out.println("\nThank You For Using The Relational Class  !!!");
System.exit(0);
default:
System.out.println("Please Enter A Valid Choice !!!");
break;
}
}
}
}
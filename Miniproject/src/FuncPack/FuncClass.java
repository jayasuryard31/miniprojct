package FuncPack;

public class FuncClass {
public int Factorial(int n)
    {
        int res = 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        return res;
    }
public int SumUptoN(int a)
{
int i, sum = 0;
for(i = 1; i <= a; ++i)  
{  
sum = sum + i;  
}
return sum;
}
public int EvenOrOdd(int a)
{
        if (a % 2 == 0) {
            System.out.println("Entered Number is Even");
        }
        else {
            System.out.println("Entered Number is Odd");
        }
        return 0;
}
}
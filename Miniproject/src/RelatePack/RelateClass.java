package RelatePack;

public class RelateClass {
public int CheckGreater(int a, int b)
{
if (a>b) {
return a;
}
else if (a==b) {
return -1;
}
else {
return b;
}
}
public int CheckSmaller(int a,int b)
{
if (a<b) {
return a;
}
else if (a==b) {
return -1;
}
else {
return b;
}
}
public int CheckEqual(int a,int b)
{
if (a==b) {
return 0;
}
else {
return 1;
}
}
}

import java.util.Arrays;
import java.util.Scanner;
public class StringSort
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the number of strings:\n");
int n=scanner.nextInt();
String[]strings=new String[n];
System.out.println("Enter the strings:");
for(int i=0;i<n;i++)
{
strings[i]=scanner.next();
}
Arrays.sort(strings);
System.out.println("\nSorted strings:");
for(String str:strings)
{
System.out.println(str);
}
scanner.close();
}
}


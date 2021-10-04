import java.util.*;
public class ugly
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        System.out.println(isUgly(a));
    }
     public static boolean isUgly(int num) 
    {
        if (num <= 0) return false;
    while (num % 2 == 0) num /= 2;
    while (num % 3 == 0) num /= 3;
    while (num % 5 == 0) num /= 5;
    return num == 1;

    }
}

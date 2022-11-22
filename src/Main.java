
/*
In this section we will se how to add any number sequence and give the correct result by using loops in java.
______________________________________________________________________________________________________________
Question : find the sum of giving number n
______________________________________________
Approach : first we take input from user and then by using while loop we put condition on it and then by using
           modules, charismatic and assignment operator we calculate the data and give the desire result.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int reminder = 0;
        int sum = 0;
        while (a > 0){
            reminder = a % 10;
            sum = sum += reminder;
            a = a / 10;
           // System.out.println(sum);

        }
        System.out.println(sum);
    }
}
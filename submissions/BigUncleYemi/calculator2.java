/**
 * Created by BIG UNCLE YEMI on 5/29/2017.
 */
import java.util.*;

public class calculator2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int calculate;

        System.out.println("enter 1 to add :");
        System.out.println("enter 2 to subtract :");
        System.out.println("enter 3 to multiply :");
        System.out.println("enter 4 to divide :");
        calculate = input.nextInt();

        switch (calculate){
            case 1:
                Scanner sumi = new Scanner(System.in);

                int number1;
                int sum =0;

                System.out.println("enter how many number to add :");
                int j = sumi.nextInt();

                for (int i =1;i<=j;i++) {
                    System.out.println("enter number :");
                    number1 = sumi.nextInt();
                    sum = sum + number1;
                }
                System.out.println("answer is " + sum);
                break;

            case 2:
                Scanner minus = new Scanner(System.in);

                int number3;
                int sub =0;

                System.out.println("enter how many number to minus:");
                int a = minus.nextInt();

                for (int i =1;i<=a;i++) {
                    System.out.println("enter number :");
                    number3 = minus.nextInt();
                        if (sub == 0){
                            sub = number3 - sub;
                        }else  {
                        sub = sub - number3;
                    }
                }
                System.out.println("answer is " + sub);
                break;

            case 3:
                Scanner multiply = new Scanner(System.in);

                int number5;
                int times = 1;

                System.out.println("enter how many number to multiply :");
                int b = multiply.nextInt();

                for (int i =1;i<=b;i++) {
                    System.out.println("enter number :");
                    number5 = multiply.nextInt();
                    times = times * number5;
                }
                System.out.println("the answer is " + times);
                break;

            case 4:
                Scanner div = new Scanner(System.in);

                int number7;
                int divide =1;

                System.out.println("enter how many number to divide:");
                int c = div.nextInt();

                for (int i =1;i<=c;i++) {
                    System.out.println("enter number :");
                    number7 = div.nextInt();
                    if (divide == 1){
                        divide = number7/divide;
                    }else  {
                        divide = divide/number7;
                    }
                }
                System.out.println("answer is " + divide);
                break;

                default:
                System.out.println("wrong operation ");
                break;
        }

    }
}

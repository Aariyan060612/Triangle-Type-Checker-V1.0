import java.util.Scanner;
class Triangles
{
    public static void main(String Args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first Angle: ");
        int a = in.nextInt();

        System.out.println("Enter second Angle: ");
        int b = in.nextInt();

        System.out.println("Enter third Angle: ");
        int c = in.nextInt();
//Gets input from the user
        int sum = a + b + c;

        if (sum == 180 && a > 0 && b > 0 && c > 0)
        {

            if (a < 90 && b < 90 && c < 90)
            {
                System.out.println("It is an acute angled triangle.");
            }
            else if (a == 90 || b == 90 || c == 90)
            {
                System.out.println("It is a right angled triangle.");
            }
            else
            {
                System.out.println("It is an obtuse angled triangle.");
            }

        } else
        {
            System.out.println("Triangle is not possible");
        }
    }
}

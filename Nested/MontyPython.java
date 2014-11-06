import java.util.Scanner;
import java.util.Random;
public class MontyPython
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        System.out.print("Enter a door number 1-3: ");
        int choice = in.nextInt();
        int car = gen.nextInt(3);
        int door1 = gen.nextInt(3);
        int door2 = gen.nextInt(3);
        int door3 = gen.nextInt(3);
                
    }
}

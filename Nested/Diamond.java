import java.util.Scanner;
import java.util.Random;
public class Diamond
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a side length: ");
        int across = in.nextInt();
        int space = across-1;
        int count = 1;
        boolean first = false;
        System.out.println(across);
        while(count<across*4&&!(count<=0&&first==true))
        {
            if(count<across*2-1&&first==false)
            {
                for(int i=0;i<space+1;i++)
                {
                    System.out.print(" ");
                }
                for(int i=0;i<count;i++)
                {
                    System.out.print("*");
                }
                for(int i=0;i<space+1;i++)
                {
                    System.out.print(" ");
                }
                System.out.println("");
                space --;
                count +=2;
            }
            else
            {
                first=true;
                for(int i=0;i<space+1;i++)
                {
                    System.out.print(" ");
                }
                for(int i=0;i<count;i++)
                {
                    System.out.print("*");
                }
                for(int i=0;i<space+1;i++)
                {
                    System.out.print(" ");
                }
                System.out.println("");
                space ++;
                count-=2;
            }
        }
    }
}

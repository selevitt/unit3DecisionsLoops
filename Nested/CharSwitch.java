import java.util.Scanner;
import java.util.Random;
public class CharSwitch
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.next();
        Random gen = new Random();
        int n = gen.nextInt(word.length()-1);
        int n2=gen.nextInt(word.length()-1);
        // BUG TESTING System.out.println(n+" "+n2);
        while(n2 < n || n2==n)
        {
            n = gen.nextInt(word.length()-1);
            n2=gen.nextInt(word.length()-1);
            // BUG TESTING System.out.println(n+" "+n2);
        }
        String sub1= word.substring(0,n);
        String sub2= word.substring(n+1,n2);
        String sub3= word.substring(n2+1,word.length());
        String newWord= sub1+word.charAt(n2)+sub2+word.charAt(n)+sub3;
        System.out.println(newWord);
    }
}

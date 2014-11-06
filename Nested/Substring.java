import java.util.Scanner;
public class Substring
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        for(int i=0;i<word.length();i++)
        {
            for(int index=0;index<word.length()-(i);index++)
            {
                System.out.println(word.substring(index,index+i+1));
            }
        }
    }
}
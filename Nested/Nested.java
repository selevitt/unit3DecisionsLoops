public class Nested
{
    public static void main(String[] args)
    {
        int n=1;
        for(int i=1;i<9;i++)
        {
            if(i<5)
            {   
                System.out.println(n + " " + i);
            }
            else
            {
                n=2;
                System.out.println(n + " " + (i-4));
            }
        }
    }
}
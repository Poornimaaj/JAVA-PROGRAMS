import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char c[]=s1.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]>='A' && c[i]<='Z')
            {
            c[i]=Character.toLowerCase(c[i]);
            System.out.print(c[i]);
            }
            else
            {
            c[i]=Character.toUpperCase(c[i]);
            System.out.print(c[i]);
            }
        }
    }
}

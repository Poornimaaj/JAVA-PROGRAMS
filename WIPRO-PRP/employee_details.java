import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int count=0;
        int m=s.nextInt();
        int n=s.nextInt();
        String a[][]=new String[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               a[i][j]=s.next();
            }
        }
        int n1=s.nextInt();
        for(int i=0;i<m;i++)
        {
              int r=Integer.parseInt(a[i][0]);
              if(r==n1)
              count=i;
            }
        int i=count;
        for(int j=0;j<n;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        
        
    }
}

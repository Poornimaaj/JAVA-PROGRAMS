import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int i,sum=0;
        for(i=0;i<9999;i++)
        {
            if((i<10) && (i!=8))
            System.out.println(i);
            
            while(i>=10)
            {
              i=i%10;
              i=i/10;
              sum=sum+i;
            }
            if(sum!=8)
            System.out.println(i);
        
            
        }
    }
}

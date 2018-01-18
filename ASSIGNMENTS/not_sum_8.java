import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int i,sum,digit=0,temp;
       
        for(i=1;i<=10;i++)
        {
            temp=i;
           sum=0;
            while(temp>0)
            {
                     digit = temp% 10;

                  sum  = sum + digit;

                    temp = temp/10;
                   
            }
            if(sum!=8)
            System.out.println(i);
       
           
        }
    }
}

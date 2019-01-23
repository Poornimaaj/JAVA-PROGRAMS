import java.util.*;
class Main
{
   public static boolean findPair(int arr[],int d)
    {
        int count=0,i,j,t=0;
     for(i=0;i<arr.length;i++)
     {
         for(j=i+1;j<arr.length;j++)
         {
             if(arr[i]<arr[j])
             {
                 t=arr[i];
                 arr[i]=arr[j];
                 arr[j]=t;
             }
         }
     }
     for(i=0;i<arr.length;i++)
     {
         for(j=i+1;j<arr.length;j++)
         {
             if(arr[i]-arr[j]==d)
             {
             count++;
             break;
             }
         }
     }
     if(count>0)
     return true;
     else
     return false;
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int i;
        int a[]=new int[5];
        for(i=0;i<a.length;i++)
        {
            a[i]=scan.nextInt();
        }
        int d1=scan.nextInt();
       boolean p=findPair(a,d1);
       if(p)
        System.out.println("yes");
        else
        System.out.println("No Such Pair");
       
       
    }
    
}

import java.util.*;
public class Main
{  
    
	public static void main(String[] args)
	{
		Scanner o = new Scanner(System.in);
		String s1 = o.nextLine();
	   String s2 = o.nextLine();
	   
	   s1=s1.toLowerCase();
	   s2=s2.toLowerCase();
	   
	   int m=s1.length();
	   int n=s2.length();
	
		if(m==n)
		{

		   char a1[] = s1.toCharArray();
            char a2[] = s2.toCharArray();
            
            Arrays.sort(a1);
            Arrays.sort(a2);
            
            if(Arrays.equals(a1, a2))
            {
                System.out.println("Anagram");
            }
            
            
		}
		else
		{
		   System.out.println("Not Anagram");
		}
		

		   
	}
}


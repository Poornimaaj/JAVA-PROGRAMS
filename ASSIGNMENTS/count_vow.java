import java.util.*;
public class Main

{
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
			String s=sc.next();
			int i,j,count=0;
			String result;
			int l=s.length();
			s=s.toLowerCase();
			char c[]=s.toCharArray();
			for( i=0;i<l;i++)
			{
			   for(j=i+1;j<l;j++)
			   {
			       if(c[i]==c[j])
			   
			        c[j]='z';
			   }
			   if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			   {
			       count++;
			   }
			}
			   
			
			  
			    System.out.print(count);
			
	}
}

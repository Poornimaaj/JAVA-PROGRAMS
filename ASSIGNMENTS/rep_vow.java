import java.util.*;
public class Main

{
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
			String s=sc.next();
			int i;
			String result;
			int l=s.length();
			s=s.toLowerCase();
			char c[]=s.toCharArray();
			for( i=0;i<l;i++)
			{
			    if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			    c[i]='z';
			   
			
			  
			    System.out.print(c[i]);
			}
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	String s;
	int i,l,a,b,c,d,h;
	Scanner scan=new Scanner (System.in);
	s=scan.nextLine();
	char ch[]=s.toCharArray();
	l=ch.length;
	for(i=0;i<l;i++)
	{
	    a=(int)ch[i];
	    b=a/10;
	    c=a%10;
	    d=b+c;
	    h=a+d;
	    
	    ch[i]=(char)h;
	    System.out.print(ch[i]);
	}
	}
}

import java.util.Scanner;
public class Camelcase {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	System.out.println("enter the string : ");
	String s1=in.nextLine();
   String[] s2=s1.split(" ");
   String a="";
   for(int i=0;i<s2.length;i++){
	   for(int j=0;j<1;j++){
	   char[] ch=s2[i].toCharArray();
	   ch[0]=Character.toUpperCase(ch[0]);

	   String s=new String(ch);
	   a=a+" "+s;
	   
	   } 
	 
   }
	
   System.out.println(a); 
}
}

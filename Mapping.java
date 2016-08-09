import java.util.Scanner;
public class Mapping {
public static void main(String[] args) {
 Scanner in=new Scanner(System.in);
 System.out.println("enter the string : ");
 String s2=in.nextLine();
 for(int i=0;i<s2.length();i=i+2){
	char ch=s2.charAt(i);
  System.out.println(ch);
  }
 for(int i=0;i<s2.length();i=i+3){
	 char ch1=s2.charAt(i);
	 System.out.println(ch1);
 }
	}

}

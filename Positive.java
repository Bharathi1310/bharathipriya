# bharathipriya
import java.util.Scanner;
public class Positive {
  public static void main(String[] args){
  Scanner in=new Scanner(System.in);
  System.out.println("enter the integer:");
  int n=in.nextInt();
  if(n>0)
  {
	  System.out.println("given number is positive");
  }
  else if(n<0)
  {
	  System.out.println("given number is negative");
  }
  else
  {
	  System.out.println("given number is zero");
  }
	}

}

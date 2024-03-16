  import java.util.Scanner;
public class ReverseString
{
public static void main (String[] args[])
{
//define variables
String instr;      //input String
int inStrLen;      //length of the input String
Scanner in=new Scanner(System.in);
//prompt and read input as "String"
System.out.print("Enter a String: ");
inStr=in.next();
intStrLen=inStr.length();
System.out.print("The Reverse of the String "+ inStr + " is ");
for(int CharIdx =intStrLen-1;CharIdx >=0;--CharIdx)
{
System.out.print(inStr.CharAt(CharIdx));
}
}
}


	
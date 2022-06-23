package corejava;

public class SnakeCase 
{
	public String camelToSnake(String str)
	 {
		//Empty String
String stt="";
//Append First Character To Lower Case
stt+=Character.toLowerCase(str.charAt(0));

for(int i=1;i<str.length();i++)
{
char ch=str.charAt(i);
         //Checking The Characters Unicode Identifier or Not
if (Character.isUnicodeIdentifierPart(ch))
{
stt=stt+'_';
stt=stt+Character.toLowerCase(ch);
}
else
{
stt=stt+ch;
 }  
}
return stt;
}

public static void main(String[] args) 
{
	     //Creating a Object of SnakeCase
SnakeCase sc=new SnakeCase();
System.out.println(sc.camelToSnake("Rohanghadge"));
}
	
}

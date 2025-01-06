package pack;

public class Lengthmethod {

	public static void main(String[] args) {
	String a="hai";
	int size=a.length();
	
	System.out.println(size);
	char S=a.charAt(2);
System.out.println(S);
String a1=a.concat("hello");
System.out.println(a1);
String b="HAI";
String c="hai";
String d=new String("HAI");
System.out.println(b.equals(d));
System.out.println(b.equals(c));
System.out.println(b.equalsIgnoreCase(d));
System.out.println(b.equalsIgnoreCase(c));
System.out.println(b==d);
	
	int e=3;
	String f=String.valueOf(e);
	System.out.println(f);}
	

}

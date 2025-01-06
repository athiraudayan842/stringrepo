package pack;

public class Methods {

	public static void main(String[] args) {
		StringBuffer Sb=new StringBuffer("Hello");
		Sb.append("World");
		System.out.println(Sb);
		Sb.insert(5,"Hai");
System.out.println(Sb);
Sb.replace(0,5 ,"Today" );
System.out.println(Sb);
Sb.delete(0, 5);
System.out.println(Sb);
Sb.reverse();
System.out.println(Sb);

	}

}

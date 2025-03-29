package myproject;

public class Myjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world hi";
		String[] s1 = {"hello","hi"};
		String s2 = new String("hello");
		System.out.println(s1[1].charAt(0));
		System.out.println(s2.charAt(0));
		String[] str = s.split("world");
		System.out.println(str[0]);
		System.out.println(str[1].trim());
		System.out.println(s.length());		
		
	}

}

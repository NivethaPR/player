package Guvi;
public class Reverse {

	public static void main(String[] args) {
		String str="";
		String s="NIVI";
		for(int i=s.length()-1;i>=0;i--) {
			str+=s.charAt(i);
		}
		String s1=str.replaceAll("[AEIOU]","");
		System.out.println(str);

		System.out.println(s1);

	}

}

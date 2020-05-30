package string.revised;

public class CharArrayToString {

	public static void main(String[] args) {

 char[] vow={'a','e'};
 String str = new String(vow);
 System.out.println(str);
 
 String str1 = new String();
 char ch;
 for(int i=0;i<vow.length;i++){
ch=vow[i];
str1=str1+ch;
 }
 System.out.println(str1);
}
}

